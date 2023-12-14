package lesson5;

import org.openqa.selenium.WebElement;





    public class HW2 {

        public static void compareElements(WebElement element1, WebElement element2) {

            int x1 = element1.getLocation().getX();
            int y1 = element1.getLocation().getY();
            int width1 = element1.getSize().getWidth();
            int height1 = element1.getSize().getHeight();

            int x2 = element2.getLocation().getX();
            int y2 = element2.getLocation().getY();
            int width2 = element2.getSize().getWidth();
            int height2 = element2.getSize().getHeight();


            if (y1 < y2) {
                System.out.println("Элемент 1 располагается выше элемента 2");
            } else if (y1 > y2) {
                System.out.println("Элемент 2 располагается выше элемента 1");
            } else {
                System.out.println("Элементы расположены на одной вертикальной линии");
            }

            if (x1 < x2) {
                System.out.println("Элемент 1 располагается левее элемента 2");
            } else if (x1 > x2) {
                System.out.println("Элемент 2 располагается левее элемента 1");
            } else {
                System.out.println("Элементы расположены на одной горизонтальной линии");
            }


            int area1 = width1 * height1;
            int area2 = width2 * height2;

            if (area1 > area2) {
                System.out.println("Элемент 1 занимает большую площадь");
            } else if (area1 < area2) {
                System.out.println("Элемент 2 занимает большую площадь");
            } else {
                System.out.println("Элементы занимают одинаковую площадь");
            }
        }


    }


