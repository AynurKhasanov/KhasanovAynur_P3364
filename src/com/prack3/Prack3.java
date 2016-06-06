package com.prack3;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Prack3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String i = req.getParameter("i");
		int val = Integer.parseInt(i);
		switch(val){

		case 1:
			String m = req.getParameter("m");
			double ex2_m = Double.parseDouble(m);
			String n = req.getParameter("n");
			double ex2_n = Double.parseDouble(n);
			double sr1;
			double sr2;
			sr1 = Math.abs(10-ex2_m);
			sr2 = Math.abs(10-ex2_n);
			if(sr1>sr2){
				resp.getWriter().println(n);
			}else{
				resp.getWriter().println(m);
			}
			break;
		case 2:
			String as = req.getParameter("a");
			double a = Double.parseDouble(as);
			String bs = req.getParameter("b");
			double b = Double.parseDouble(bs);
			String cs = req.getParameter("c");
			double c = Double.parseDouble(cs);
			double D = b*b-4*a*c;
			if(D > 0){
				resp.getWriter().println( (-b - Math.sqrt(D))/2);
				resp.getWriter().println( (-b + Math.sqrt(D))/2);
			}else if (D == 0){
				resp.getWriter().println( -(b/2*a));
			}else{
				resp.getWriter().println( "Fail");
			}
			break;
		case 3:
			int n_arr = 8;
			int m_arr = 5;
			int[][] array1 = new int[n_arr][m_arr];
			for(int i_3 = 0; i_3 < n_arr; i_3++){ 
				for(int j_3 = 0; j_3 < m_arr; j_3++){
					array1[i_3][j_3] = ((int)(11+Math.random()*(100-11)));
					resp.getWriter().print(array1[i_3][j_3]+" | ");
				}
				resp.getWriter().println("<br>");
			}
			break;
		case 4:
			int n_arr2 = 5;
			int m_arr2 = 8;
			int max = 0;
			int[][] array2 = new int[n_arr2][m_arr2];
			for(int i_4 = 0; i_4 < n_arr2; i_4++){ 
				for(int j_4 = 0; j_4 < m_arr2; j_4++){
					array2[i_4][j_4] = ((int)(Math.random()*(200)-100));
					resp.getWriter().print(array2[i_4][j_4]+" | ");
					if(Math.abs(array2[i_4][j_4]) > Math.abs(max)){
						max = array2[i_4][j_4];
					}
				}
				resp.getWriter().println("<br>");
			}
			resp.getWriter().println("<br>"+max);
			break;
		}
	}
}