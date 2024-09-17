
//naive o(n*n)
issorted(int arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                return true;
            }
        }
        return false;
    }
}
jajfd
/////
effective way

issorted(int arr[]){
    fo
    r(int i=1;i<n;i++){
        if(arr[i-1]<arr[i]){
            return true 
        }
        return false
    }

}
