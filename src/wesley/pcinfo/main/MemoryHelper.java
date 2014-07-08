package wesley.pcinfo.main;

import java.text.DecimalFormat;

public class MemoryHelper {
	public static String size(long l){
		String dsize = "";
	    long k = l;
	    double m = l/1024.0;
	    double g = l/1048576.0;
	    double t = l/1073741824.0;
	    
	    DecimalFormat dec = new DecimalFormat("0.00");
	  
	    if (k>1){
	    dsize = dec.format(k).concat(" KB");}
	   
	    if (m>1){
	    	dsize = dec.format(m).concat(" MB");}
	    if (g>1){
	    	dsize = dec.format(g).concat(" GB");}
	    if (t>1){
	    	dsize = dec.format(t).concat(" TB");}
	    
	    if(!dsize.isEmpty())
	    	return dsize;
	    else
	    	return "Dit kon niet berekend worden er ging iets fout dit kan aan u pc liggen.";
	}
}
