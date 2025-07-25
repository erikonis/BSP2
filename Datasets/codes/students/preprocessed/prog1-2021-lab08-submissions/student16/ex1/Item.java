public class Item {
	// we need for the item a name and a description both as string
	private String Name;
	private String Description;

	public Item(String name, String description) {
		Name = name;
		Description = description;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "The Item description: " + Description + "and the name of the object is " + Name + " ";
	}
}