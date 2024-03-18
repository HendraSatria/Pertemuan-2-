/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author Huawei
 */
public class switchcase {

    public static void main(String[] args) {
        int dayOfWeek = 3;
        String day;

        day = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("Day of the week: " + day);
    }
}
