#include<iostream>

using namespace std;

template <class T>
T Maximum(T No1, T No2, T No3)
{
    if((No1 > No2) && (No1 < No3))
    {
        return No1;
    }
    else if ((No2 > No1) && (No2 > No3))
    {
        return No2;
    }
    else
    {
        return No3;
    }
}

int main()
{
    double dValue1 = 10.0, dValue2 = 11.0, dValue3 = 20.0, dRet = 0.0;
    int iValue1 = 10, iValue2 = 112, iValue3 = 20, iRet = 0;

    dRet = Maximum(dValue1, dValue2, dValue3);
    cout<<"Maximum Double is : "<<dRet<<"\n"; 
    
    iRet = Maximum(iValue1, iValue2, iValue3);
    cout<<"Maximum Integer is : "<<iRet<<"\n"; 
    
    return 0;
}