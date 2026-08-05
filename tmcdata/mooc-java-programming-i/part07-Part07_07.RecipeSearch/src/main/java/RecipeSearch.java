
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println("File to read:");
        String file = scanner.nextLine();
        boolean addingIngredients = false;
        boolean addingCookingTime = false;
        String lastRecipeName = "";

        try (Scanner fScanner = new Scanner(Paths.get(file))) {
            while (fScanner.hasNextLine()) {
                String line = fScanner.nextLine();
                if (!addingIngredients && !addingCookingTime) {
                    lastRecipeName = line;
                    addingCookingTime = true;
                } else if(!addingIngredients && addingCookingTime) {
                    int cookingTime = Integer.valueOf(line);
                    recipes.add(new Recipe(lastRecipeName, cookingTime));
                    addingCookingTime = false;
                    addingIngredients = true;
                } else if(addingIngredients) {
                    if (!line.isEmpty()) {
                        recipes.get(recipes.size() - 1).addIngredient(line);
                    } else {
                        addingIngredients = false;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (!recipes.isEmpty()) {
            start(scanner, recipes);
        }
    }

    public static void start(Scanner scanner, ArrayList<Recipe> recipes) {
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("\nEnter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                System.out.println("Recipes:");
                findByName(recipes, name);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                findByCookingTime(recipes, maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                findByIngredient(recipes, ingredient);
            }
        }
    }

    public static void findByName(ArrayList<Recipe> recipes, String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public static void findByCookingTime(ArrayList<Recipe> recipes, int maxCookingTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findByIngredient(ArrayList<Recipe> recipes, String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
