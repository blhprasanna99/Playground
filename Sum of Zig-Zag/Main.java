#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[20][20],s=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if( i==0 || i==r-1)
        s=s+a[i][j];
    }
  }
    for(i=1;i<r-1;i++)
  {
    for(j=c-2;j>0;j--)
    {
      s=s+a[i][j];
    }
 }
  cout<<"Sum of Zig-Zag pattern is "<<s;//Type your code here.
}