//navie solution
//to find second largestgit sstls
CLEA

int secondlargestelement(
    int largest = getlargest(arr,n);
    int res=-1;
    for(int i=0;i<n; i++){
      if(arr[i]=!arr[largest]){
        if(res==-1){
            res=i;
        }
        else(arr[i]>arr[res])
        {
            res=i;
        }
    }
    }

)
int largest(int arr[],int n)
{
    int largest=0;
for(int i=1;i<n;i++){
    if(arr[i]>arr[largest]){
        largest=i;
    }
}
}


///////////////////////////////////
//  efficient way 

int secondlargest{
    int largest=0;
    int res =-1;
    for(int i=1;i<n;i++){
        if(arr[i]>arr[largest]){
            largest= i;
        }
        elseif(arr[i]=!arr[largest]){
            if(res==-1|| arr[i]>arr[res]){
                res=i;
            }
        }
    }

}



