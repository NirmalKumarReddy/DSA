public class freqencies_in_sortedarry(int arr[]) {
    int n=arr.length;
    int freq=1;
    for(int i=1;i<n;i++{
        if(arr[i]==arr[i-1]){
           freq++;
        }
    })
    return freq;

}

public class freqencies_in_sortedarry(int arr[]){
    int n=arr.length;
    int i=1,freq=1;
    while(i<n){
        while(i<n && arr[i]==arr[i-1]){
            freq++;
            i++;
        }
        System.out.println(arr[i-1]+""+freq);
        i++;
        freq=1;
    }
    if(n==1&&arr[n-1]&&arr[n-2]){
        System.out.println(arr[n-1]+""+1);
    }
}

