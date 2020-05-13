#include<iostream>
using namespace std;
int main()
{
  int r,c,n,flag=0,k=0,i,j;
  cin>>r>>c>>n;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      k=k+1;
      if(i==1 || j==1 || j==c)
      {
        if(k==n)
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==1)
      break;
  }
  if(flag==1)
  {
    cout<<"Yes";
  }
  else 
  {
    cout<<"No";
  }
}