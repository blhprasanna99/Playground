#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a,i,n,mc=0,fc=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
    if(a[i]%2==0)
      fc++;
    else
      mc++;
  }
  cout<<mc<<'\n'<<fc;// Type your code here
  return 0;
}