package lesson5;
import org.openqa.selenium.WebElement;


public class HW3 {



        public static void printElementInfo(WebElement element) {

            String elementId = element.getAttribute("id");
            String tagName = element.getTagName();
            String className = element.getAttribute("class");
            String attributeName = element.getAttribute("name");
            String text = element.getText();


            int centerX = element.getLocation().getX() + element.getSize().getWidth() / 2;
            int centerY = element.getLocation().getY() + element.getSize().getHeight() / 2;


            System.out.println("ID элемента: " + (elementId != null ? elementId : "Отсутствует"));
            System.out.println("Тег элемента: " + tagName);
            System.out.println("Класс элемента: " + (className != null ? className : "Отсутствует"));
            System.out.println("Атрибут name: " + (attributeName != null ? attributeName : "Отсутствует"));
            System.out.println("Текст элемента: " + (text != null ? text : "Отсутствует"));
            System.out.println("Координаты центра элемента: (" + centerX + ", " + centerY + ")");
        }


    }


