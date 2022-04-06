package modernTester;

import modernTester.basic.base.AlertTests;
import modernTester.basic.base.FormTest;
import modernTester.basic.base.IframesTest;
import modernTester.interactions.base.*;
import modernTester.others.base.HighSiteTest;
import modernTester.widgets.base.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends TestBase {

    @Test
    @Order(1)
    @DisplayName("Form Test")
    public void formTest() {
        new FormTest()
                .fillFormWithSuccess();
    }

    @Test
    @Order(2)
    @DisplayName("Simple alert pop up")
    public void simpleAlert() {
        new AlertTests()
                .simpleAlertPopUP();
    }

    @Test
    @Order(3)
    @DisplayName("Prompt Alert Box")
    public void promptAlertBox() {
        new AlertTests()
                .promptAlertBox();
    }

    @Test
    @Order(4)
    @DisplayName("Delayed alert")
    public void delayedAlertButton() {
        new AlertTests()
                .delayedAlert();
    }

    @Test
    @Order(5)
    @DisplayName("Confirm Alert box")
    public void confirmAlertBox() {
        new AlertTests()
                .confirmAlertBox();
    }


    @Test
    @Order(6)
    @DisplayName("Iframes")
    public void iframes() {
        new IframesTest()
                .iframes();
    }

    @Test
    @Order(7)
    @DisplayName("Slider")
    public void slider() {
        new SliderTest()
                .sliderTest();
    }

    @Test
    @Order(8)
    @DisplayName("Tooltip")
    public void tooltip() {
        new TooltipTextTest()
                .tooltipTextTest();
    }

    @Test
    @Order(9)
    @DisplayName("According")
    public void according() {
        new AccordionTest()
                .accordingTest();
    }

    @Test
    @Order(10)
    @DisplayName("Progressbar")
    public void progressbar() {
        new ProgressBarTest()
                .progressBarTest();
    }

    @Test
    @Order(11)
    @DisplayName("Autocomplete")
    public void autocomplete() {
        new AutocompleteTest()
                .AutocompleteTest();
    }

    @Test
    @Order(12)
    @DisplayName("Menu")
    public void menu() {
        new MenuTest()
                .menuTest();
    }

    @Test
    @Order(13)
    @DisplayName("Modal")

    public void modal() {
        new ModalDialogTest()
                .modalTest();
    }

    @Test
    @Order(14)
    @DisplayName("Data picker")

    public void dataPicker() {
        new DataPickerTest()
                .dataPickerTest();
    }

    @Test
    @Order(15)
    @DisplayName("Drag and drop")

    public void dragAndDrop() {
        new DroppableTest()
                .droppableTest();
    }

    @Test
    @Order(16)
    @DisplayName("Draggable")

    public void draggable() {
        new DraggableTest()
                .draggableTest();
    }

    @Test
    @Order(17)
    @DisplayName("Selectable")

    public void selectable() {
        new SelectableTest()
                .selectableTest();
    }

    @Test
    @Order(18)
    @DisplayName("Resizable")

    public void resizable() {
        new ResizableTest()
                .resizableTest();
    }

    @Test
    @Order(19)
    @DisplayName("Sortable")

    public void sortable() {
        new SortableTest()
                .sortableTest();

    }
    @Test
    @Order(20)
    @DisplayName("High Site")

    public void high() {
        new HighSiteTest()
                .scroll();

    }
}