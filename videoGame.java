package store;

import java.util.scanner;

public class videoGame implements menu {
	public string[] companyList(){"Sega", "Nintendo", "Playstation", "Indie", "Atari", "Meta", "Xbox", "Microsoft", "EA", "Ubisoft"};
	public string[] platformList(){"console", "arcade", "mobile", "online", "handheld", "PC", "VR"};
	public string[] genreList(){"action", "adventure", "puzzle", "casual", "simulation", "sports", "racing","fighting", "RPG", "MMORPG"};

	Scanner input = new Scanner(System.in);


	public void orderMenu(){
		System.out.println("Enter the company the game is from: ");

		this.companyList() = input.nextLine();
		Company cp = new Company();
		cp.sort();

		System.out.println("Enter the platform the game is compatable with: ");
		this.platformList() = input.nextLine();

		Platform pf = new Platform();
		pf.sort();


		System.out.println("Enter the genre of the game: ");
		this.genreList = input.nextLine();
		Genre ge = new Genre();
		ge.sort();
	}
}
