package DZ6Task1;

public class PresenterInt {
    View view;
    ModelInt model;

    public PresenterInt(ModelInt mInt, View v) {
        model = mInt;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.printInt(result, "Результат: ");
    }
}