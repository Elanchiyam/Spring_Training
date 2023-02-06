package flatmap;

import java.util.List;

public class OperatingSystem {
	private Integer id;
	private String name;
	private List<String> versions;
	public OperatingSystem(Integer id, String name, List<String> versions) {
		super();
		this.id = id;
		this.name = name;
		this.versions = versions;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getVersions() {
		return versions;
	}
	public void setVersions(List<String> versions) {
		this.versions = versions;
	} 
	
}
