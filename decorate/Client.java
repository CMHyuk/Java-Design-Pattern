package decorate;

public class Client {
    public static void main(String[] args) {
        /*RoadDisplay road = new RoadDisplay();
        road.draw();

        LaneDecorator roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        TrafficDecorator roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();*/

        TrafficDecorator road = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        road.draw();
    }
}
