#include<iostream>
using namespace std;
int main()
{
  int r,c,a[20][20],rs[20],cs[20],i,j,m,rm,cm;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
     m=0;
    for(j=0;j<c;j++)
    {
      m=m+a[i][j];
    }
     rs[i]=m;
  }
   for(i=0;i<c;i++)
  {
     m=0;
    for(j=0;j<r;j++)
    {
      m=m+a[j][i];
    }
     cs[i]=m;
  }
  cout<<"Sum of rows is ";
  rm=rs[0];
  m=0;
   for(i=0;i<r;i++)
  {
    cout<<rs[i]<<' ';
     if(rs[i]>rm)
     {
       rm=rs[i];
       m=i;
     }
  }
  cout<<"\nRow "<<m+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  cm=cs[0];
  m=0;
   for(i=0;i<c;i++)
  {
    cout<<cs[i]<<' ';
     if(cs[i]>cm)
     {
       cm=cs[i];
       m=i;
     }
  }
  cout<<"\nColumn "<<m+1<<" has maximum sum"; 
}