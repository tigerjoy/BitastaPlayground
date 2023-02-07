       String outFileName2=fileName+"2."+extension;
        try
        {
            File inFile=new File(inFileName);
            if(inFile.exists())
            {
                FileInputStream fin=new FileInputStream(inFile);
                FileOutputStream fout1=new FileOutputStream(outFileName1);
                for(int j=0;j<=fin.available()/2;j++)
                {
                    int readByte=fin.read();
                    fout1.write(readByte);
                }
                fout1.close();
                FileOutputStream fout2=new FileOutputStream(outFileName2);
                int readByte=fin.read();
                while(readByte!=-1)
                {
                    fout2.write(readByte);
                    readByte=fin.read();
                }
                fin.close();
                fout2.close();
                System.out.println("Files are created successfully!");
            }
            else
            {
                System.out.println(inFileName+" does not exist.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An I/O error ocurred.");
            e.printStackTrace();
        }
    }//End of main()
}//End of class