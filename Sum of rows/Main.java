#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[20][20],b[10],s;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    s=0;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      s=s+a[i][j];
      b[i]=s;
    }
  }
for(i=0;i<r;i++)
  {
      cout<<b[i]<<'\n';
}
}