#include<iostream>
using namespace std;
int main()
{
  int i,n,a[20],rn,f=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>rn;
  for(i=0;i<n;i++)
  {
    if(rn==a[i])
    {
      f=1;
      break;
    }
  }
  if(f==1)
    cout<<"She passed her exam";
  else 
    cout<<"She failed";
    
}