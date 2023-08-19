
    class Table {
	int SeatingCapacity;
	int Cost;
	String color;
	String brand;
	  
	void allowsTosit()
	{
		System.out.println("User can sit on the Table which is "+color+" in color");
	}
	void allowToWrite()
	{
		System.out.println("User can write in the Book by keeping it on the table which costs "+ Cost);
	}

}
