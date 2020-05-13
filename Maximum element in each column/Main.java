#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[10][10],b[10],m;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    m=0;
    for(j=0;j<r;j++)
    {
      if(a[j][i]>m)
        m=a[j][i];
    }
    cout<<m<<'\n';
  }
}