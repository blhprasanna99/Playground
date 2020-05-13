#include <iostream>
using namespace std;
int main() 
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(i%2==0 && j==1)
        cout<<i+1;
      else if(i%2!=0 && j==n)
        cout<<i+1;
      else
        cout<<i;
    }
    cout<<"\n";
  }
    return 0;
}