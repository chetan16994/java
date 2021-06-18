package Queue;

public class CircularPupms {
    static class petrolPump {
        int petrol;
        int distance;

        public petrolPump(int petrol, int distance) {
            this.distance = distance;
            this.petrol = petrol;
        }
    }

        static int printTour(petrolPump arr[], int n){
            int start=0;
            int end=1;

            int currPetrol=arr[start].petrol-arr[start].distance;

            while(end!=start || currPetrol<0){
                while (currPetrol< 0 && start!=end) {
                    currPetrol -= arr[start].petrol - arr[start].distance;
                    start = (start + 1) % n;

                    if (start == 0)
                        return -1;
                }
                    currPetrol += arr[end].petrol - arr[end].distance;
                    end= (end+1)%n;
                }
            return start;
    }

    public static void main(String[] args) {
        petrolPump[] arr={new petrolPump(6,4),
        new petrolPump(3,6),
        new petrolPump(7,3)};

        System.out.println(printTour(arr,arr.length));
    }
}
