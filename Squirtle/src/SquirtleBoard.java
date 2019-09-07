public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(8, 4);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	}
	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 0
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(0, 0);
	 	add(squirtle);
	 		 	
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur = new BulbasaurThing();
	 	bulbasaur.setLocation(4, 0);
	 	add(bulbasaur);
	 	
	 	MeowthThing meowth = new MeowthThing();
	 	meowth.setLocation(0, 1);
	 	add(meowth);
		 	
	 	int numFlowers = 3;
	 	
	 	if (squirtle.getLocation() != thingAt(4,2).getLocation()) {
	 		//while(bulbasaur.getLocation() == thingAt(4,0).getLocation()){
	 			//squirtle.setLocation(0, 0);
	 		//}
	 		squirtle.setLocation(thingAt(4,2).getLocation());
	 		remove(thingAt(4,2));
	 	}
	 	
	 	for (int i=0; i<30; i++) {
	 	if (squirtle.getLocation() == thingAt(4,2).getLocation()) {
	 		remove(thingAt(4,2));
	 	}
	 	if (squirtle.getLocation() == thingAt(4,1).getLocation()) {
	 		remove(thingAt(4,1));
	 	}
	 	if (squirtle.getLocation() == thingAt(4,0).getLocation()) {
	 		remove(thingAt(4,0));
	 	}
	 	}
	 		
	 		/*remove(bulbasaur);
	 	for (int i=0; i<numFlowers; i++) {
	 		CoinThing coin = new CoinThing();
		 	coin.setLocation(4,2-i);
		 	add(coin);
	 	 }
		 /*if (squirtle.getBoard().thingAt(squirtle.getDirection().getNextLocation(squirtle.getLocation())) instanceof BulbasaurThing) {
		 		CoinThing coin = new CoinThing();
			 	coin.setLocation(0, 1);
			 	add(coin);
	 }*/
				
		
	 	
	 	/*boolean blocked;
		
		Location nextLoc = squirtle.getDirection().getNextLocation(squirtle.getLocation()); 
		blocked = squirtle.getBoard().thingAt(nextLoc) instanceof PokeThing;
	 	stuck = !(nextLoc.isValid(squirtle.getBoard()));
	 	
		while (blocked == true) {
			CoinThing coin = new CoinThing();
		 	coin.setLocation(squirtle.getLocation());
		 	add(coin);
	 	}*/
	 	
	 	/*boolean blocked;
		boolean coins;
		
		Location nextLoc = squirtle.getDirection().getNextLocation(squirtle.getLocation()); 
		blocked = thingAt(nextLoc) instanceof PokeThing;
		coins = thingAt(nextLoc) instanceof BulbasaurThing;
	 	
		if (blocked == false) {
			CoinThing coin = new CoinThing();
		 	coin.setLocation(0,1);
		 	add(coin);
		 	bulbasaur.putFlower();
	 	}*/
			
	 	/*if (squirtle.getLocation() != bulbasaur.getLocation()) {
	 		CoinThing squirtle1 = new CoinThing();
		 	squirtle1.setLocation(1, 0);
		 	add(squirtle1);
		 	squirtle1.step();
	 	}*/
	}
	
}

	
	

