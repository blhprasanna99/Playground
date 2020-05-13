#include<iostream>
using namespace std;
int main()
{
  int n,a[20],i,j,t,p,e;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array ";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>p;
  if(p<=n)
  {
  cout<<"\nEnter the value to insert";
  cin>>e;
  for(i=0;i<n;i++)
  {
    if(i==p-1)
    {
      for(j=n;j>=p-1;j--)
      {
        a[j]=a[j-1];
      }
      break;
    }
  }
  a[p-1]=e;
  cout<<"\nArray after insertion is";
  for(i=0;i<=n;i++)
  {
    cout<<'\n'<<a[i];
  }
  }
  else
    cout<<"\nInvalid Input";//Type your code here.
}