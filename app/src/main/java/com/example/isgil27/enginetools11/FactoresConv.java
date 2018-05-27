package com.example.isgil27.enginetools11;

/**
 * Created by Israel on 19/05/2018.
 */

public class FactoresConv {
    double [] factlongitudcm=new double[6];
    double [] factlongitudm=new double[6];
    double[] factlongitudin=new double[6];
    double [] factlongitudft=new double[6];
    double [] factlongitudyd=new double[6];
    double [] factlongitudmile=new double[6];

    double [] factpesomg=new double[6];
    double [] factpesog=new double[6];
    double [] factpesokg=new double[6];
    double [] factpesolb=new double[6];
    double [] factpesooz=new double[6];
    double [] factpesotone=new double[6];

    double [] factpotenciaW=new double[6];
    double [] factpotenciakW=new double[6];
    double [] factpotenciaMW=new double[6];
    double [] factpotenciakcal=new double[6];
    double [] factpotenciaHP=new double[6];
    double [] factpotenciaBTU=new double[6];

    public double[] FactoresConv (int i, int j)
    {
        double [] arreglofactores=new double[6];


        switch (i)
        {
            case 0:

                switch (j)
                {
                    case 0:

                        factlongitudcm[0]=1;
                        factlongitudcm[1]=1*Math.pow(10,-2);
                        factlongitudcm[2]=0.3937;
                        factlongitudcm[3]=3.281*Math.pow(10,-3);
                        factlongitudcm[4]= 0.0109361;
                        factlongitudcm[5]=6.214*Math.pow(10,-6);
                         arreglofactores = factlongitudcm;
                        break;
                    case 1:
                        factlongitudm[0]=100;
                        factlongitudm[1]=1;
                        factlongitudm[2]=39.37;
                        factlongitudm[3]=3.281;
                        factlongitudm[4]=3.281*3;
                        factlongitudm[5]=6.214*Math.pow(10,-4);
                        arreglofactores = factlongitudm;
                        break;
                    case 2:
                        factlongitudin[0]=2.54;
                        factlongitudin[1]=0.0254;
                        factlongitudin[2]=1;
                        factlongitudin[3]=0.0833;
                        factlongitudin[4]=1/36;
                        factlongitudin[5]=1.578*Math.pow(10,-5);
                        arreglofactores = factlongitudin;
                        break;
                    case 3:
                        factlongitudft[0]=1;
                        factlongitudft[1]=2;
                        factlongitudft[2]=3;
                        factlongitudft[3]=4;
                        factlongitudft[4]=5;
                        factlongitudft[5]=6;
                        arreglofactores = factlongitudft;
                        break;
                    case 4:
                        factlongitudyd[0]=2;
                        factlongitudyd[1]=3;
                        factlongitudyd[2]=4;
                        factlongitudyd[3]=5;
                        factlongitudyd[4]=6;
                        factlongitudyd[5]=7;
                        arreglofactores = factlongitudyd;
                        break;
                    case 5:
                        factlongitudmile[0]=8;
                        factlongitudmile[1]=9;
                        factlongitudmile[2]=10;
                        factlongitudmile[3]=11;
                        factlongitudmile[4]=12;
                        factlongitudmile[5]=13;
                        arreglofactores = factlongitudmile;
                        break;

                }
                break;

            case 1:
                switch (j)
                {
                    case 0:
                        factpesomg[0]=.1;
                        factpesomg[1]=.2;
                        factpesomg[2]=.3;
                        factpesomg[3]=.4;
                        factpesomg[4]=.5;
                        factpesomg[5]=.6;
                        arreglofactores = factpesomg;

                        break;
                    case 1:
                        factpesog[0]=.1;
                        factpesog[1]=.2;
                        factpesog[2]=.3;
                        factpesog[3]=.4;
                        factpesog[4]=.5;
                        factpesog[5]=.6;
                        arreglofactores = factpesog;

                        break;
                    case 2:
                        factpesokg[0]=1;
                        factpesokg[1]=2;
                        factpesokg[2]=3;
                        factpesokg[3]=4;
                        factpesokg[4]=5;
                        factpesokg[5]=6;
                        arreglofactores = factpesokg;

                        break;
                    case 3:
                        factpesolb[0]=.0;
                        factpesolb[1]=.0;
                        factpesolb[2]=.0;
                        factpesolb[3]=.0;
                        factpesolb[4]=.0;
                        factpesolb[5]=.0;
                        arreglofactores = factpesolb;

                        break;
                    case 4:
                        factpesooz[0]=.01;
                        factpesooz[1]=.02;
                        factpesooz[2]=.03;
                        factpesooz[3]=.04;
                        factpesooz[4]=.05;
                        factpesooz[5]=.06;
                        arreglofactores = factpesooz;

                        break;
                    case 5:
                        factpesotone[0]=10;
                        factpesotone[1]=20;
                        factpesotone[2]=30;
                        factpesotone[3]=40;
                        factpesotone[4]=50;
                        factpesotone[5]=60;
                        arreglofactores = factpesotone;

                        break;


                }
                break;

            case 2:
                switch (j)
                {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;


                }
                break;

        }

      return arreglofactores;
    }


}
