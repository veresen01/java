package DZ6Task1;

public class PresenterRac {
    View view;
    ModelRac model;

    public PresenterRac(ModelRac mRac, View v) {
        model = mRac;
        view = v;
    }

    public void buttonClick(){
        int a1 = view.getValue("a1: ");
        int b1 = view.getValue("b1: ");
        int a2 = view.getValue("a2: ");
        int b2 = view.getValue("b2: ");
        model.setX1(a1);
        model.setY1(b1);
        model.setX2(a2);
        model.setY2(b2);
        String result = model.result();
        view.printRac(result, "Sum: ");
    }
}