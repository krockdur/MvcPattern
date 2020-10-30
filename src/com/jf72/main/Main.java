package com.jf72.main;

import com.jf72.job.Job;
import com.jf72.model.Data;
import com.jf72.ui.MainFrame;

public class Main {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		MainFrame mainFrame = new MainFrame();

		Job controller = new Job(mainFrame, data);
		controller.initController();

	}

}
