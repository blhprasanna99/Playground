#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,m,a[10][10],b[10];
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    m=0;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>m)
        m=a[i][j];
    }
    b[i]=m;
  }
   for(i=0;i<r;i++)
  {
    cout<<b[i]<<"\n";
   }
}