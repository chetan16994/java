package old;

public class HammingDistance {

        static int maxHamming(int arr[], int n)
        {
            int carr[]=new int[2*n+1];
            for (int i=0;i<n;i++)
                carr[i]=arr[i];
            for (int i=0;i<n;i++)
                carr[n+i]=arr[i];

            int maxhum=0;
            for (int i=1;i<n-1;i++){
                int hum=0;
                for (int j=i,k=0;j<(i+n) ;j++,k++){
                    if (carr[j]!=arr[k])
                      hum++;

                    if (hum == n)
                        return n;
                }
                maxhum = Math.max(maxhum, hum);
            }
            return maxhum;
        }

        // driver code
        public static void main (String[] args)
        {
            int arr[] = {1,1,4,5,1};
            int n = arr.length;
            System.out.print(maxHamming(arr, n));
        }
    }

