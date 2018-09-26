/*******************************************************************************
 * Copyright (c) 2018 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.phoebus.app.viewer3d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo3dViewer extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Viewer3dPane viewerPane = new Viewer3dPane();
        
        Scene scene = new Scene(viewerPane, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
