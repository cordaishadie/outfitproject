/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.guilford.outfitpickerproject;

import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author cshad
 */
public class Fitcheck {

   
    // Attributes
    private String shirt;
    private String bottom;
    private String shoes;
    private String jacket;
    private String glasses;
    private String bag;
    private String silverJewelry; 
    private String weather;
    private String occasion;

    // Constructors
    public Fitcheck() {
        Random rand = new Random();

        int shirtChoice = rand.nextInt(6);
        if (shirtChoice == 0) {
            shirt = "Tank Top";
        } else if (shirtChoice == 1) {
            shirt = "Short-Sleeved T-Shirt";
        } else if (shirtChoice == 2) {
            shirt = "Long-Sleeved T-Shirt";
        } else if (shirtChoice == 3) {
            shirt = "Short-Sleeved Blouse";
        } else if (shirtChoice == 4) {
            shirt = "Long-Sleeved Bouse";
        } else {
            shirt = "Sweater";
        }
        
        int bottomChoice = rand.nextInt(7);
        if (bottomChoice == 0) {
            bottom = "Jean Shorts";
        } else if (bottomChoice == 1) {
            bottom = "Athletic Shorts";
        } else if (bottomChoice == 2) {
            bottom = "Jeans";
        } else if (bottomChoice == 3) {
            bottom = "Sweatpants";
        } else if (bottomChoice == 4) {
            bottom = "Cargos";
        } else if (bottomChoice== 5){
            bottom = "Leggings";
        } else {
            bottom = "Dress Pants";
        }
        
        
        int shoesChoice = rand.nextInt(6);
        if (shoesChoice == 0) {
            shoes = "Sandals";
        } else if (shoesChoice == 1) {
            shoes = "Sneakers";
        } else if (shoesChoice == 2) {
            shoes = "Boots";
        } else if (shoesChoice == 3) {
            shoes = "Heels";
        } else if (shoesChoice == 4) {
            shoes = "Crocs";
        } else {
            shoes = "Slippers";
        }
        
        int jacketChoice = rand.nextInt(5);
        if (jacketChoice == 0) {
            jacket = "No Jacket";
        } else if (jacketChoice == 1) {
            jacket = "Denim Jacket";
        } else if (jacketChoice == 2) {
            jacket = "Cotton Jacket";
        } else if (jacketChoice == 3) {
            jacket = "Fleece Jacket";
        } else {
            jacket = "Coat";
        }
        
        boolean glassesCoice = rand.nextBoolean();
        if (glassesCoice == true) {
            glasses = "Sunglasses";
        } else {
            glasses = "No Glasses";
        }
        
        int bagChoice = rand.nextInt(4);
        if (bagChoice == 0) {
            bag = "No Bag";
        } else if (bagChoice == 1) {
            bag = "Tote Bag";
        } else if (bagChoice == 2) {
            bag = "Handbag";
        } else {
            bag = "Clutch Bag";
    }
        
        boolean jewelryChoice = rand.nextBoolean();
        if (jewelryChoice == true) {
            silverJewelry = "Silver Jewelry";
        } else {
            silverJewelry = "Gold Jewelry";
        }
           
        int weatherChoice = rand.nextInt(3);
        if (weatherChoice == 0) {
            weather = "Cold";
            jacket = "Coat";
            glasses = "No Glasses";
            // jacket = "Coat";
            if (shirt == "Tank Top") {
                shirt = "Sweater";
            } else if (bottom == "Jean Shorts") {
                bottom = "Jeans";
            } else if (bottom == "Athletic Shorts") {
                bottom = "Sweatpants";
            } else if (shoes == "Sandals") {
                shoes = "Boots";
            }
        }
        else if (weatherChoice == 1) {
            weather = "Warm";
            glasses = "No Glasses";
            if (shirt == "Tank Top") {
                shirt = "Short-Sleeved T-Shirt";
            } else if (shirt == "Sweater") {
                shirt = "Long-Sleeved T-Shirt";
            } else if (bottom == "Jean Shorts") {
                bottom = "Jeans";
            } else if (bottom == "Athletic Shorts") {
                bottom = "Leggings";
            } else if (shoes == "Sandals") {
                shoes = "Sneakers";
            } else if (jacket == "Coat") {
                jacket = "Cotton Jacket";
            } else if (jacket == "No Jacket") {
                jacket = "Denim Jacket";
            }
        }
        else if (weatherChoice == 2) {
            weather = "Hot";
            jacket = "No Jacket";
            glasses = "Sunglasses";
            if (shirt == "Sweater") {
                shirt = "Tank Top";
            } else if (shirt == "Long-Sleeved T-Shirt") {
                shirt = "Short-Sleeved T-Shirt";
            } else if (shirt == "Long-Sleeved Blous") {
                shirt = "Short-Sleeved Blouse";
            } else if (bottom == "Sweatpants") {
                bottom = "Athletic Shorts";
            } else if (shoes == "Boots") {
                shoes = "Sandals";
            }
            
    }
        int occasionChoice = rand.nextInt(3);
        if (occasionChoice == 0) {
            occasion = "Chill";
            bag = "Tote Bag";
            if (shirt == "Long-Sleeved Blouse") {
                shirt = "Long-Sleeved T-Shirt";
            } else if (shirt == "Short-Sleeved Blouse") {
                shirt = "Short-Sleeved T-Shirt";
            } else if (bottom == "Dress Pants") {
                bottom = "Sweatpants";
            } else if (shoes == "Heels") {
                shoes = "Slippers";
            }
        }
        else if (occasionChoice == 1) {
            occasion = "Casual";
            if (bottom == "Dress Pants") {
                bottom = "Jeans";
            } else if (shoes == "Heels") {
                shoes = "Crocs";
            }
        }
        else if (occasionChoice == 2) {
            occasion = "Formal";
            bottom = "Dress Pants";
            if (shirt == "Tank Top") {
                shirt = "Short-Sleeved Blouse";
            } else if (shirt == "Short-Sleeved T-Shirt") {
                shirt = "Short-Sleeved Blouse";
            } else if (shirt == "Long-Sleeved T-Shirt") {
                shirt = "Long-Sleeved Blouse";
            } else if (shoes == "Sneakers") {
                shoes = "Boots";
            } else if (shoes == "Crocs") {
                shoes = "Heels";
            } else if (shoes == "Slippers") {
                shoes = "Sandals";
            } else if (jacket == "Denim Jacket") {
                jacket = "Cotton Jacket";
            } else if (bag == "No Bag") {
                bag = "Handbag";
            }
        }
        
    }
    public Fitcheck(String shirt, String bottom, String shoes, String jacket, String glasses, String bag, String silverJewelry, String weather, String occasion) {
        this.shirt = shirt;
        this.bottom = bottom;
        this.shoes = shoes;
        this.jacket = jacket;
        this.glasses = glasses;
        this.bag = bag;
        this.silverJewelry = silverJewelry;
    }

    // Methods
    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getJacket() {
        return jacket;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public String getSilverJewelry() {
        return silverJewelry;
    }

    public void setSilverJewelry(String silverJewelry) {
        this.silverJewelry = silverJewelry;
    }
    
     public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

   
    public String toString() {
        String output;

        output = "Shirt: " + shirt + "\n"
                + "Bottom: " + bottom + "\n"
                + "Shoes: " + shoes + "\n"
                + "Jacket: " + jacket + "\n"
                + "Glasses: " + glasses + "\n"
                + "Bag: " + bag + "\n"
                + "Jewelry: " + silverJewelry + "\n"
                + "Weather: " + weather + "\n" 
                + "Occasion: " + occasion;
        return output;
   }
     
    
    
    
}
