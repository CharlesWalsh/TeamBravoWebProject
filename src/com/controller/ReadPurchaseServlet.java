package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Stb;
import com.dao.StbDao;

//@WebServlet("/ReadPurchaseServlet")
public class ReadPurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadPurchaseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Stb stb = new Stb();
		StbDao sd = new StbDao();

		stb.setStd_id(1);
		if(sd.read(stb))
		{
			System.out.println(stb);

			HttpSession session = request.getSession();
			session.setAttribute("stb", stb);
		} else {
			System.out.println("Unsuccessful read for stb");
		}

		request.getRequestDispatcher("/C_PurchaseBoxTotal.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}