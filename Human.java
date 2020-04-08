package in.satheesh.strings;

public class Human {
	public int aadharNumer;
	public String name;
	/**
	 * @param aadharNumer
	 * @param name
	 */
	public Human(int aadharNumer, String name) {
		this.aadharNumer = aadharNumer;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aadharNumer;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (aadharNumer != other.aadharNumer)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
