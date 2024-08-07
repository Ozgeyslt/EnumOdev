public class SolarSystem {
    public enum Planets{
        Mercury(1,"2000000KM",2500,2000),
        Venus(2,"3000000KM",6000,1500),
        Earth(3,"400000KM",5300,1200),
        Mars(4,"20000000KM",3400,100),
        Jupiter(5,"7878787887KM",70000,12500),
        Saturn(6,"92342344234KM",58000,125),
        Uranus(7,"23498234989823KM",25000,250),
        Neptune(8,"23423423412413424KM",25000,369),
        Pluto(9,"234231425134513451345KM",1200,20);

        private Integer placement;

        private String distance;

        private int radius;

        private int rotationTime;

        Planets(Integer placement,String distance,int radius,int rotationTime)
        {
            this.placement=placement;
            this.distance=distance;
            this.radius=radius;
            this.rotationTime=rotationTime;
        }

        public Integer getPlacement() {
            return placement;
        }

        public void setPlacement(Integer placement) {
            this.placement = placement;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getRotationTime() {
            return rotationTime;
        }

        public void setRotationTime(int rotationTime) {
            this.rotationTime = rotationTime;
        }


    }


}
