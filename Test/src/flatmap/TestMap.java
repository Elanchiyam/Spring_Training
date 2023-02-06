package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {

	public static List<OperatingSystem> getAll() {
		return Stream.of(
				new OperatingSystem(121,"Windows",Arrays.asList("Xp","Vista","7","8","10","11")),
				new OperatingSystem(1123,"Linux",Arrays.asList("Kali linux","Ubuntu","Fedora","Debian","lUbuntu")),
				new OperatingSystem(2124,"Mac",Arrays.asList("Cheeta 10","PUMA 10","PANTHER 8")),
				new OperatingSystem(1302,"Chrome",Arrays.asList("Flex","ALPHR","PANTHER 8")))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<OperatingSystem> os = TestMap.getAll();
		List<String> osNames = os.stream()
				.map(OperatingSystem::getName)
				.collect(Collectors.toList());
		
		System.out.println(osNames);
									
		List<String> osVersions = os.stream()
				.flatMap(ver->ver.getVersions()
						.stream())
						.collect(Collectors.toList());
		System.out.println(osVersions);
	}
}
