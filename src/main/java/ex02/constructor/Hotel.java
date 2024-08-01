package ex02.constructor;

public class Hotel {
    private Chef chef;

    public Hotel(Chef chef) {
//        호텔 생성 시 쉐프 객체를 받는다 (호텔 객체는 chef 객체에 의존적이다)
        this.chef = chef;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
