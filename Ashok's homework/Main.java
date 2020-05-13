#include<iostream>
using namespace std;
int main()
{
   int i,j,r,c;
   cin>>r>>c;
   int a[r][c],b[r][c];
   for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
     {
       cin>>a[i][j];
     }
   }
  for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
     {
       cin>>b[i][j];
     }
   }
  for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
     {
       cout<<a[i][j]+b[i][j]<<" ";
     }
    cout<<"\n";
   }// Type your code here// Type your code here// Type your code here
}