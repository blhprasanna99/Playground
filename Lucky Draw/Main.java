#include<iostream>
using namespace std;
int main()
{
  int i,c=0,n;
  cin>>n;
  for(i=1;i<n/2;i++)
  {
    if(n%i==0)
    {
      c=c+1;
    }
  }
  if(c==1) {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
}