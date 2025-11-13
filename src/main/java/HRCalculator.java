public class HRCalculator {
    public static int calculateMaxHR(int age){
        if(age>120){
            throw new IllegalArgumentException(
                    "Age out of bounds"
            );
        }
        return 220 - age;
    }
    public static String getWorkoutZone(int age, int bpm){
        int maxHR = calculateMaxHR(age);
        double percentage = (bpm * 100.0) / maxHR;

        if (percentage < 60) return "Warm up";
        else if (percentage < 70) return "Fat burn";
        else if (percentage < 80) return "Aerobic";
        else if (percentage < 90) return "Anaerobic";
        else return "Maximum";
    }
}
