// @authors : Samuel Anumudu and Caleb Mugisha

//Define class
public class BMICalculator {

    public static void main (String[] args){

        // --------- Given Personal information ---------
        String name = "Johnson";
        float weight = 85.5f; // in Kilograms
        float height = 1.8288f; // in meters squared

        // ---------- Calculate BMI --------------
        //Formula for BMI is mass(or weight) / height, for weight in kilograms and height in meters squared
        float BMI = weight / (height * height);
        // ------- print BMI of BMI ----------
        System.out.println("BMI for " + name + " = " + BMI);

        // ---------- Weight type indicator -----------
        // This is according to the Center For Disease Control And Prevention(CDC)

        // Define parameters for underweight, normal weight, overweight and obesity
        if (BMI < 18.5) {
            System.out.println("(It falls within the underweight range)");
        } else if ((BMI == 18.5) || (BMI < 25)) {
            System.out.println("(It falls within the normal)");
        } else if ((BMI == 25.0) || (BMI < 30)) {
            System.out.println("(It falls within the overweight range)");
        } else if (BMI >= 30.0) {
            System.out.println("(It falls within the obese range)");
        }

        // ------ Perimeter of Rectangle -------------
        // P=2(l+w) where l is length and w is width
        int lengthOfRectangle = 7;
        int widthOfRectangle = 12;

        int perimeterOfRectangle = 2 * (lengthOfRectangle + widthOfRectangle);
        System.out.println("Perimeter of Rectangle = " + perimeterOfRectangle +"cm");

        // ------- Surface of Rectangle -------
        // A=wl where w is width and l is length
        int surfaceOfRectangle = widthOfRectangle * lengthOfRectangle;
        System.out.println("Surface of Rectangle = " + surfaceOfRectangle + "cm squared");
    }

    }