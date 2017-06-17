package collections.Examples;

class Library 
{
	
	private String[] category = { "ScienceFiction","Mythological",
								  "Medical Suspense","Thriller","Romance","Historical" } ;

	public String[] getCategory()
	{
		return category;
	}
	public static void main(String[ ] args) 
	{
		Library lib = new Library();
		String[] listOfTopics = lib.getCategory();
		System.out.println("Novels are available in the below categories");
		for(int i=0 ; i<listOfTopics.length ; i++)
			System.out.println(i+1 + "." +listOfTopics[i]);
	}
}
