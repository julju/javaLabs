package labFourth.view;

class ViewFactory implements AbstractFactory {

    @Override
    public Console createConsoleView() {
        return new ConsoleView();
    }
}