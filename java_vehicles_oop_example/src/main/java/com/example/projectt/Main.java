package com.example.projectt;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.example.projectt.alertWarning.display;


public class Main extends Application
{


    @Override
    public void start(Stage mainPage) {
        StackPane logInRoot = new StackPane();
        StackPane registerRoot = new StackPane();
        StackPane root = new StackPane();
        StackPane carsRoot = new StackPane();
        StackPane planesRoot = new StackPane();
        StackPane shipsRoot = new StackPane();
        StackPane rootAraba1 = new StackPane();
        StackPane rootAraba2 = new StackPane();
        StackPane rootAraba3 = new StackPane();
        StackPane rootAraba4 = new StackPane();
        StackPane rootAraba5 = new StackPane();
        StackPane rootAraba6 = new StackPane();
        StackPane rootGemi1 = new StackPane();
        StackPane rootGemi2 = new StackPane();
        StackPane rootGemi3 = new StackPane();
        StackPane rootGemi4 = new StackPane();
        StackPane rootGemi5 = new StackPane();
        StackPane rootGemi6 = new StackPane();
        StackPane rootPlane1 = new StackPane();
        StackPane rootPlane2 = new StackPane();
        StackPane rootPlane3 = new StackPane();
        StackPane rootPlane4 = new StackPane();
        StackPane rootPlane5 = new StackPane();
        StackPane rootPlane6 = new StackPane();


        Scene scene = new Scene(logInRoot,1000,1000);
        Scene RegisterScene = new Scene(registerRoot,1000,1000);
        Scene SecondScene = new Scene(root,1000,1000);
        Scene carsScene = new Scene(carsRoot,1000,1000);
        Scene planesScene= new Scene(planesRoot,1000,1000);
        Scene shipsScene= new Scene(shipsRoot,1000,1000);
        Scene araba1 = new Scene(rootAraba1,1000,1000);
        Scene araba2 = new Scene(rootAraba2,1000,1000);
        Scene araba3 = new Scene(rootAraba3,1000,1000);
        Scene araba4 = new Scene(rootAraba4,1000,1000);
        Scene araba5 = new Scene(rootAraba5,1000,1000);
        Scene araba6 = new Scene(rootAraba6,1000,1000);
        Scene sceneplane1 = new Scene(rootPlane1,1000,1000);
        Scene sceneplane2 = new Scene(rootPlane2,1000,1000);
        Scene sceneplane3 = new Scene(rootPlane3,1000,1000);
        Scene sceneplane4 = new Scene(rootPlane4,1000,1000);
        Scene sceneplane5 = new Scene(rootPlane5,1000,1000);
        Scene sceneplane6 = new Scene(rootPlane6,1000,1000);
        Scene gemi1 = new Scene(rootGemi1,1000,1000);
        Scene gemi2 = new Scene(rootGemi2,1000,1000);
        Scene gemi3 = new Scene(rootGemi3,1000,1000);
        Scene gemi4 = new Scene(rootGemi4,1000,1000);
        Scene gemi5 = new Scene(rootGemi5,1000,1000);
        Scene gemi6 = new Scene(rootGemi6,1000,1000);

        //Log ın page ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Image imageMainBg = new Image("aa.jpg");
        ImageView iwMainBg = new ImageView(imageMainBg);
        iwMainBg.setFitWidth(1000);
        iwMainBg.setFitHeight(1000);

        Button btnLogInToReg = new Button("Register");
        Button btnLogIn = new Button("Log In");
        Label lblUsernameTxt = new Label("Username :");
        Label lblPasswordText = new Label("Password :");
        TextField txtUsername = new TextField();
        PasswordField txtPassword = new PasswordField();

        logInRoot.getChildren().addAll(iwMainBg,btnLogIn,lblPasswordText,lblUsernameTxt,txtUsername,txtPassword,btnLogInToReg);

        txtUsername.setMaxSize(200,25);
        txtPassword.setMaxSize(200,25);
        txtUsername.setTranslateX(50);
        txtUsername.setTranslateY(-150);
        txtPassword.setTranslateX(50);
        txtPassword.setTranslateY(-50);

        btnLogInToReg.setMaxSize(75,25);
        btnLogInToReg.setStyle("-fx-text-fill: red");
        btnLogInToReg.setTranslateY(20);

        btnLogIn.setTranslateX(100);
        btnLogIn.setTranslateY(20);
        btnLogIn.setMaxSize(75,25);
        btnLogIn.setStyle("-fx-text-fill: red");

        lblUsernameTxt.setMaxSize(200,75);
        lblUsernameTxt.setTranslateX(-100);
        lblUsernameTxt.setTranslateY(-150);
        lblUsernameTxt.setStyle("-fx-font-size: 20;-fx-text-fill: red");

        lblPasswordText.setMaxSize(200,75);
        lblPasswordText.setTranslateX(-100);
        lblPasswordText.setTranslateY(-50);
        lblPasswordText.setStyle("-fx-font-size: 20;-fx-text-fill: red");
        btnLogIn.setOnAction(event -> {
            try {
                File file = new File("src/main/java/com/example/projectt/logs.txt");
                String username = txtUsername.getText();
                String password = txtPassword.getText();
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                boolean isLoginSuccess = false;
                String line;

                while ((line = br.readLine()) != null) {
                    String[] split = line.split(",");

                    if (username.equals(split[0]) && password.equals(split[1])) {
                        isLoginSuccess = true;
                        mainPage.setScene(SecondScene);
                        mainPage.show();
                        break;
                    }
                }

                if (!isLoginSuccess) {
                    display("Warning ! " ,"Wrong username or password ! ");
                }

                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btnLogInToReg.setOnAction(event -> mainPage.setScene(RegisterScene));
        //Register Page ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Image imageGeri = new Image("back.jpg");
        ImageView btnRegisterToLogIn = new ImageView(imageGeri);

        
        Image imageRegisterPage = new Image("aa.jpg");
        ImageView iwRegisterPage = new ImageView(imageRegisterPage);
        iwRegisterPage.setFitWidth(1000);
        iwRegisterPage.setFitHeight(1000);

        btnRegisterToLogIn.setFitWidth(100);
        btnRegisterToLogIn.setFitHeight(50);

        Label lblUsernameReg = new Label("Username :");
        Label lblPasswordReg = new Label("Password :");
        TextField txtUsernameReg = new TextField();
        TextField txtPasswordReg = new TextField();
        Button btnRegister = new Button("Register");

        registerRoot.getChildren().addAll(iwRegisterPage,lblPasswordReg,lblUsernameReg,txtPasswordReg,txtUsernameReg,btnRegister,btnRegisterToLogIn);

        txtUsernameReg.setMaxSize(200,25);
        txtPasswordReg.setMaxSize(200,25);
        txtUsernameReg.setTranslateX(50);
        txtUsernameReg.setTranslateY(-150);
        txtPasswordReg.setTranslateX(50);
        txtPasswordReg.setTranslateY(-50);


        lblUsernameReg.setMaxSize(200,75);
        lblUsernameReg.setTranslateX(-100);
        lblUsernameReg.setTranslateY(-150);
        lblUsernameReg.setStyle("-fx-font-size: 20;-fx-text-fill: red");

        lblPasswordReg.setMaxSize(200,75);
        lblPasswordReg.setTranslateX(-100);
        lblPasswordReg.setTranslateY(-50);
        lblPasswordReg.setStyle("-fx-font-size: 20;-fx-text-fill: red");

        btnRegisterToLogIn.setTranslateX(-400);
        btnRegisterToLogIn.setTranslateY(-400);

        btnRegister.setStyle("-fx-text-fill: red;-fx-cell-size: 100 50");
        btnRegister.setTranslateX(50);
        btnRegister.setTranslateY(20);
        btnRegister.setOnAction(actionEvent -> {
            try {
                String username = txtUsernameReg.getText();
                String password = txtPasswordReg.getText();
                File file = new File("logs.txt");

                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);

                if (username.equals("")  || password.equals("")) {
                        display("ERROR !", "Empty Input ! ");
                    }

                     else {
                        String pathLogin = "logs.txt";
                        FileReader fr = new FileReader(pathLogin);
                        BufferedReader br = new BufferedReader(fr);
                        boolean alreadyExists = false;
                        String line;

                        while ((line = br.readLine()) != null) {
                            String[] split = line.split(",");

                            if (username.equals(split[0])) {
                                alreadyExists = true;

                                break;
                            }
                        }
                        if (alreadyExists) {
                            display("ERROR !", "User already exists");

                        }
                        else{
                            bw.write("\n" + username + "," + password);
                            bw.close();
                            display("Succesful", "Succesfully Signed !");
                        }
                        fr.close();
                    }

                } catch (IOException e) {
                e.printStackTrace();
            }
        }
        );
        btnRegisterToLogIn.setOnMouseClicked(e->mainPage.setScene(scene));
        //Main Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Image imageMainBg2 = new Image("aa.jpg");
        ImageView iwMainBg2 = new ImageView(imageMainBg2);
        Media carsound = new Media(new File("src/main/java/com/example/projectt/carSound.mp3").toURI().toString());
        MediaPlayer carmediaPlayer = new MediaPlayer(carsound);

        Media shipsound = new Media(new File("src/main/java/com/example/projectt/ship_Sound.mp3").toURI().toString());
        MediaPlayer shipmediaPlayer = new MediaPlayer(shipsound);

        Media planesound = new Media(new File("src/main/java/com/example/projectt/jet_Sound.mp3").toURI().toString());
        MediaPlayer planemediaPlayer = new MediaPlayer(planesound);
        Image imageCar = new Image("Cars.jpg");
        ImageView btnCar = new ImageView(imageCar);
        btnCar.setFitWidth(250);
        btnCar.setFitHeight(250);

        Image imageShips = new Image("Ships.jpg");
        ImageView btnShip = new ImageView(imageShips);
        btnShip.setFitWidth(250);
        btnShip.setFitHeight(250);

        Image imagePlane = new Image("Planes.jpg");
        ImageView btnPlane = new ImageView(imagePlane);
        btnPlane.setFitWidth(250);
        btnPlane.setFitHeight(250);


        Label lblVehicles = new Label("VEHICLES");
        root.getChildren().addAll(iwMainBg2,btnShip,btnPlane,btnCar,lblVehicles);
        btnCar.setTranslateX(-300);
        btnCar.setTranslateY(0);
        btnPlane.setTranslateX(300);
        btnPlane.setTranslateY(0);
        btnShip.setTranslateX(0);
        btnShip.setTranslateY(0);
        lblVehicles.setTranslateX(0);
        lblVehicles.setTranslateY(-300);
        lblVehicles.setStyle("-fx-font-size: 100;-fx-text-fill:red");
        iwMainBg2.setFitWidth(1000);
        iwMainBg2.setFitHeight(1000);
        mainPage.setResizable(false);
        btnPlane.setOnMouseClicked(actionEvent -> {
            mainPage.setScene(planesScene);
            planemediaPlayer.play();
        });
        btnShip.setOnMouseClicked(actionEvent -> {
            mainPage.setScene(shipsScene);
            shipmediaPlayer.play();
        });
        btnCar.setOnMouseClicked(actionEvent -> {
            mainPage.setScene(carsScene);
            carmediaPlayer.play();
        });
        //Cars Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Image imageCarsBg = new Image("bgCars.jpg");
        ImageView iwCarsBg = new ImageView(imageCarsBg);
        iwCarsBg.setFitWidth(1000);
        iwCarsBg.setFitHeight(1000);

        Image imageCars = new Image("home.png");
        ImageView btnCarsGeri = new ImageView(imageCars);
        btnCarsGeri.setFitWidth(100);
        btnCarsGeri.setFitHeight(100);

        Image imageAraba1 = new Image("Car1.jpg");
        ImageView btnAraba1 = new ImageView(imageAraba1);
        btnAraba1.setFitWidth(200);
        btnAraba1.setFitHeight(200);

        Image imageAraba2 = new Image("Car2.jpg");
        ImageView btnAraba2 = new ImageView(imageAraba2);
        btnAraba2.setFitWidth(200);
        btnAraba2.setFitHeight(200);// maybe make all images in one package okkk

        Image imageAraba3 = new Image("Car3.jpg");
        ImageView btnAraba3 = new ImageView(imageAraba3);
        btnAraba3.setFitWidth(200);
        btnAraba3.setFitHeight(200);

        Image imageAraba4 = new Image("Car4.jpg");
        ImageView btnAraba4 = new ImageView(imageAraba4);
        btnAraba4.setFitWidth(200);
        btnAraba4.setFitHeight(200);

        Image imageAraba5 = new Image("Car5.jpg");
        ImageView btnAraba5 = new ImageView(imageAraba5);
        btnAraba5.setFitWidth(200); // wait
        btnAraba5.setFitHeight(200);

        Image imageAraba6 = new Image("Car6.jpg");
        ImageView btnAraba6 = new ImageView(imageAraba6);
        btnAraba6.setFitWidth(200);
        btnAraba6.setFitHeight(200);

        carsRoot.getChildren().addAll(iwCarsBg,btnAraba1,btnAraba2,btnAraba3,btnAraba4,btnAraba5,btnAraba6,btnCarsGeri);

        btnAraba1.setTranslateX(-250);
        btnAraba1.setTranslateY(-120);
        btnAraba2.setTranslateX(0);
        btnAraba2.setTranslateY(-120);
        btnAraba3.setTranslateX(250);
        btnAraba3.setTranslateY(-120);
        btnAraba4.setTranslateX(-250);
        btnAraba4.setTranslateY(100);
        btnAraba5.setTranslateX(0);
        btnAraba5.setTranslateY(100);
        btnAraba6.setTranslateX(250);
        btnAraba6.setTranslateY(100);
        btnCarsGeri.setTranslateX(-400);
        btnCarsGeri.setTranslateY(-350);
// what we can do :D  wait lets see what s wronng with url , or resource they say
        btnCarsGeri.setOnMouseClicked(e->mainPage.setScene(SecondScene));
        btnAraba1.setOnMouseClicked(e->mainPage.setScene(araba1));
        btnAraba2.setOnMouseClicked(e->mainPage.setScene(araba2));
        btnAraba3.setOnMouseClicked(e->mainPage.setScene(araba3));
        btnAraba4.setOnMouseClicked(e->mainPage.setScene(araba4));
        btnAraba5.setOnMouseClicked(e->mainPage.setScene(araba5));
        btnAraba6.setOnMouseClicked(e->mainPage.setScene(araba6));

        //Car1 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//

        AtomicBoolean car1Durum = new AtomicBoolean(false);
        Cars car_Pagani = new Cars(2011,"Zonda","Pagani",6.0,"Manual","Gray","375 km/h" ,2,2,"1.070 kg ","17.000.000 TL");
        String infoCar1 = "Marka : "+car_Pagani.getMarka()+"\n"+"Model : "+car_Pagani.getModel()+"\n"+"Engine : "+car_Pagani.getMotor()+"\n"+"Weight : "+car_Pagani.getAgirlik()+"\n"+"Color : " + car_Pagani.getRenk()+"\n"+"Transmission : "+car_Pagani.getVites()+"\n"+"Top Speed : "+car_Pagani.getMaxSpeed()+"\n"+"Passanger : " +car_Pagani.getYolcu()+ "\n"+"Doors : "+car_Pagani.getKapi()+"\n"+"Price : "+car_Pagani.getFiyat();
        Image imageCar1 = new Image("1_I7vcluVgbhdcMJx86iY62w.jpeg");
        ImageView imgCar1 = new ImageView(imageCar1);
        imgCar1.setFitWidth(600);
        imgCar1.setFitHeight(600);
        imgCar1.setTranslateX(-200);
        imgCar1.setTranslateY(0);


        Image imageRgGeri = new Image("back.jpg");
        ImageView btnAraba1Geri = new ImageView(imageRgGeri);
        Label lblCar1Info= new Label();
        Button btnCar1GetInfo= new Button("Get Information");
        rootAraba1.getChildren().addAll(btnAraba1Geri,lblCar1Info,btnCar1GetInfo,imgCar1);
        lblCar1Info.setTranslateX(300);
        lblCar1Info.setTranslateY(0);
        btnCar1GetInfo.setTranslateX(300);
        btnCar1GetInfo.setTranslateY(-400);
        btnAraba1Geri.setTranslateX(-400);
        btnAraba1Geri.setTranslateY(-400);
        btnAraba1Geri.setFitWidth(100);
        btnAraba1Geri.setFitHeight(50);
        btnCar1GetInfo.setMinSize(300,50);
        btnAraba1Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        btnCar1GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnCar1GetInfo.setOnAction(actionEvent -> {
            if(!car1Durum.get()){
                lblCar1Info.setText(infoCar1);
                car1Durum.set(true);
            }
            else {
                lblCar1Info.setText("");
                car1Durum.set(false);

            }

        });
        lblCar1Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        rootAraba1.setStyle("-fx-background-color: #f0d044");


        //Car2 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Cars car_S400d = new Cars(2017,"S400 d","Mercedes",3.0,"Automatıc","Black","260 km/h",5,4,"1.995 kg","7.000.000 TL");
        AtomicBoolean car2Durum = new AtomicBoolean(false);
        String infoCar2 = "Marka : "+car_S400d.getMarka()+"\n"+"Model : "+car_S400d.getModel()+"\n"+"Engine : "+car_S400d.getMotor()+"\n"+"Weight : "+car_S400d.getAgirlik()+"\n"+"Color : " + car_S400d.getRenk()+"\n"+"Transmission : "+car_S400d.getVites()+"\n"+"Top Speed : "+car_S400d.getMaxSpeed()+"\n"+"Passanger : " +car_S400d.getYolcu()+ "\n"+"Doors : "+car_S400d.getKapi()+"\n"+"Price : "+car_S400d.getFiyat();
        Image imageCar2 = new Image("mercedes-s400_1.jpg");
        ImageView imgCar2 = new ImageView(imageCar2);
        imgCar2.setFitWidth(600);
        imgCar2.setFitHeight(600);
        imgCar2.setTranslateX(-200);
        imgCar2.setTranslateY(0);
        Label lblCar2Info= new Label();
        Button btnCar2GetInfo= new Button("Get Information");
        lblCar2Info.setTranslateX(300);
        lblCar2Info.setTranslateY(0);
        btnCar2GetInfo.setTranslateX(300);
        btnCar2GetInfo.setTranslateY(-400);
        btnCar2GetInfo.setMinSize(300,50);
        btnCar2GetInfo.setStyle("-fx-background-color:blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnCar2GetInfo.setOnAction(actionEvent -> {
            if(!car2Durum.get()){
                lblCar2Info.setText(infoCar2);
                car2Durum.set(true);
            }
            else {
                lblCar2Info.setText("");
                car2Durum.set(false);

            }

        });
        lblCar2Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriCar2 = new Image("back.jpg");
        ImageView btnAraba2Geri = new ImageView(imageGeriCar2);
        btnAraba2Geri.setFitHeight(50);
        btnAraba2Geri.setFitWidth(100);
        rootAraba2.getChildren().addAll(btnAraba2Geri,lblCar2Info,btnCar2GetInfo,imgCar2);
        btnAraba2Geri.setTranslateX(-400);
        btnAraba2Geri.setTranslateY(-400);
        btnAraba2Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        rootAraba2.setStyle("-fx-background-color: #f0d044");


        //Car3 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean car3Durum = new AtomicBoolean(false);
        Cars car_Range = new Cars(2020,"Discovery","Range Rover",3.0,"Automatic","Brown","240 km/h",7,5,"2.342 kg ","2.000.000 TL");
        String infoCar3 = "Marka : "+car_Range.getMarka()+"\n"+"Model : "+car_Range.getModel()+"\n"+"Engine : "+car_Range.getMotor()+"\n"+"Weight : "+car_Range.getAgirlik()+"\n"+"Color : " + car_Range.getRenk()+"\n"+"Transmission : "+car_Range.getVites()+"\n"+"Top Speed : "+car_Range.getMaxSpeed()+"\n"+"Passanger : " +car_Range.getYolcu()+ "\n"+"Doors : "+car_Range.getKapi()+"\n"+"Price : "+car_Range.getFiyat();
        Image imageCar3 = new Image("2021-land-rover-discovery-r-dynamic-exterior-front-quarter-off-road.jpg");
        ImageView imgCar3 = new ImageView(imageCar3);
        imgCar3.setFitWidth(600);
        imgCar3.setFitHeight(600);
        imgCar3.setTranslateX(-200);
        imgCar3.setTranslateY(0);
        Label lblCar3Info= new Label();
        Button btnCar3GetInfo= new Button("Get Information");
        Image imageGeriCar3 = new Image("back.jpg");
        ImageView btnAraba3Geri = new ImageView(imageGeriCar3);
        rootAraba3.getChildren().addAll(btnAraba3Geri,lblCar3Info,btnCar3GetInfo,imgCar3);
        lblCar3Info.setTranslateX(300);
        lblCar3Info.setTranslateY(0);
        btnCar3GetInfo.setTranslateX(300);
        btnCar3GetInfo.setTranslateY(-400);
        btnCar1GetInfo.setMinSize(300,50);
        btnCar3GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnCar3GetInfo.setMinSize(300,50);


        btnAraba3Geri.setFitHeight(50);
        btnAraba3Geri.setFitWidth(100);
        btnAraba3Geri.setTranslateX(-400);
        btnAraba3Geri.setTranslateY(-350);
        btnAraba3Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        btnCar3GetInfo.setOnAction(actionEvent -> {
            if(!car3Durum.get()){
                lblCar3Info.setText(infoCar3);
                car3Durum.set(true);
            }
            else {
                lblCar3Info.setText("");
                car3Durum.set(false);

            }

        });
        lblCar3Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        rootAraba3.setStyle("-fx-background-color: #f0d044");


        //Car4 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Cars car_Passat = new Cars(2021,"Passat","Volksvagen",2.0,"Automatıc","Black","260 km/h",5,4,"1.500 kg","1.500.000 TL");
        AtomicBoolean car4Durum = new AtomicBoolean(false);
        String infoCar4 = "Marka : "+car_Passat.getMarka()+"\n"+"Model : "+car_Passat.getModel()+"\n"+"Motor : "+car_Passat.getMotor()+"\n"+"Weight : "+car_Passat.getAgirlik()+"\n"+"Color : " + car_Passat.getRenk()+"\n"+"Transmission : "+car_Passat.getVites()+"\n"+"Top Speed : "+car_Passat.getMaxSpeed()+"\n"+"Passanger : " +car_Passat.getYolcu()+ "\n"+"Doors : "+car_Passat.getKapi()+"\n"+"Price : "+car_Passat.getFiyat();
        Image imageCar4 = new Image("WV-CC.jpg");
        ImageView imgCar4 = new ImageView(imageCar4);
        imgCar4.setFitWidth(600);
        imgCar4.setFitHeight(600);
        imgCar4.setTranslateX(-200);
        imgCar4.setTranslateY(0);

        Image imageGeriCar4 = new Image("back.jpg");
        ImageView btnAraba4Geri = new ImageView(imageGeriCar4);
        Label lblCar4Info= new Label();
        Button btnCar4GetInfo= new Button("Get Information");
        rootAraba4.getChildren().addAll(btnAraba4Geri,lblCar4Info,btnCar4GetInfo,imgCar4);
        lblCar4Info.setTranslateX(300);
        lblCar4Info.setTranslateY(0);
        btnCar4GetInfo.setTranslateX(300);
        btnCar4GetInfo.setTranslateY(-400);
        btnAraba4Geri.setTranslateX(-400);
        btnAraba4Geri.setTranslateY(-350);
        btnCar4GetInfo.setMinSize(300,50);
        btnAraba4Geri.setFitHeight(50);
        btnAraba4Geri.setFitWidth(100);

        btnAraba4Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        btnCar4GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnCar4GetInfo.setOnAction(actionEvent -> {
            if(!car4Durum.get()){
                lblCar4Info.setText(infoCar4);
                car4Durum.set(true);
            }
            else {
                lblCar4Info.setText("");
                car4Durum.set(false);

            }

        });
        lblCar4Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        rootAraba4.setStyle("-fx-background-color: #f0d044");

        //Car5 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean car5Durum = new AtomicBoolean(false);
        Cars car_Tesla = new Cars(2020,"Model S","Tesla",3.0,"Automatıc","Red","260 km/h",5,4,"2.200 kg","2.000.000 TL");
        String infoCar5 = "Marka : "+car_Tesla.getMarka()+"\n"+"Model : "+car_Tesla.getModel()+"\n"+"Engine : "+car_Tesla.getMotor()+"\n"+"Weight : "+car_Tesla.getAgirlik()+"\n"+"Color : " + car_Tesla.getRenk()+"\n"+"Transmission : "+car_Tesla.getVites()+"\n"+"Top Speed : "+car_Tesla.getMaxSpeed()+"\n"+"Passanger : " +car_Tesla.getYolcu()+ "\n"+"Doors : "+car_Tesla.getKapi()+"\n"+"Price : "+car_Tesla.getFiyat();
        Image imageCar5 = new Image("2021-tesla-model-s-plaid.jpg");
        ImageView imgCar5 = new ImageView(imageCar5);
        imgCar5.setFitWidth(600);
        imgCar5.setFitHeight(600);
        imgCar5.setTranslateX(-200);
        imgCar5.setTranslateY(0);
        Image imageGeriCar5 = new Image("back.jpg");
        ImageView btnAraba5Geri = new ImageView(imageGeriCar5);
        btnAraba5Geri.setFitHeight(50);
        btnAraba5Geri.setFitWidth(100);

        Label lblCar5Info= new Label();
        Button btnCar5GetInfo= new Button("Get Information");
        rootAraba5.getChildren().addAll(btnAraba5Geri,lblCar5Info,btnCar5GetInfo,imgCar5);
        lblCar5Info.setTranslateX(300);
        lblCar5Info.setTranslateY(0);
        btnCar5GetInfo.setTranslateX(300);
        btnCar5GetInfo.setTranslateY(-400);
        btnCar5GetInfo.setMinSize(300,50);
        btnCar5GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnCar5GetInfo.setOnAction(actionEvent -> {
            if(!car5Durum.get()){
                lblCar5Info.setText(infoCar5);
                car5Durum.set(true);
            }
            else {
                lblCar5Info.setText("");
                car5Durum.set(false);

            }

        });
        lblCar5Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        btnAraba5Geri.setTranslateX(-400);
        btnAraba5Geri.setTranslateY(-350);
        btnAraba5Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        rootAraba5.setStyle("-fx-background-color: #f0d044");

        //Car6 Page Properties ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Cars car_Gle53 = new Cars(2020,"GLE 53","Mercedes",3.0,"Automatıc","White","260 km/h",5,4,"2.500 kg","2.500.000 TL");
        AtomicBoolean car6Durum = new AtomicBoolean(false);
        String infoCar6 = "Marka : "+car_Gle53.getMarka()+"\n"+"Model : "+car_Gle53.getModel()+"\n"+"Engine : "+car_Gle53.getMotor()+"\n"+"Weight : "+car_Gle53.getAgirlik()+"\n"+"Color : " + car_Gle53.getRenk()+"\n"+"Transmission : "+car_Gle53.getVites()+"\n"+"Top Speed : "+car_Gle53.getMaxSpeed()+"\n"+"Passanger : " +car_Gle53.getYolcu()+ "\n"+"Doors : "+car_Gle53.getKapi()+"\n"+"Price : "+car_Gle53.getFiyat();
        Image imageCar6 = new Image("2020-mercedes-amg-gle-53-4matic-coupe-1.jpg"); // w
        ImageView imgCar6 = new ImageView(imageCar6);
        imgCar6.setFitWidth(600);
        imgCar6.setFitHeight(600);
        imgCar6.setTranslateX(-200);
        imgCar6.setTranslateY(0);
        Image imageGeriCar6 = new Image("back.jpg");
        ImageView btnAraba6Geri = new ImageView(imageGeriCar6);
        btnAraba6Geri.setFitHeight(50);
        btnAraba6Geri.setFitWidth(100);

        Label lblCar6Info= new Label();
        Button btnCar6GetInfo= new Button("Get Information");
        rootAraba6.getChildren().addAll(btnAraba6Geri,lblCar6Info,btnCar6GetInfo,imgCar6);
        lblCar6Info.setTranslateX(300);
        lblCar6Info.setTranslateY(0);
        btnCar6GetInfo.setTranslateX(300);
        btnCar6GetInfo.setTranslateY(-400);
        btnCar1GetInfo.setMinSize(300,50);
        btnCar6GetInfo.setMinSize(300,50);
        btnCar6GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        rootAraba6.setStyle("-fx-background-color: #f0d044");

        btnAraba6Geri.setTranslateX(-400);
        btnAraba6Geri.setTranslateY(-350);
        btnAraba6Geri.setOnMouseClicked(e->mainPage.setScene(carsScene));
        btnCar6GetInfo.setOnAction(actionEvent -> {
            if(!car6Durum.get()){
                lblCar6Info.setText(infoCar6);
                car6Durum.set(true);
            }
            else {
                lblCar6Info.setText("");
                car6Durum.set(false);

            }

        });
        lblCar6Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");



        //Planes Page Properties -------------------------------------------------------------------------------------------
        Image imagePlanesBg = new Image("bgPlanes.jpg");
        ImageView iwPlanesBg = new ImageView(imagePlanesBg);
        iwPlanesBg.setFitWidth(1000);
        iwPlanesBg.setFitHeight(1000);

        Image imagePlanes = new Image("home.png");
        ImageView btnPlanesGeri = new ImageView(imagePlanes);

        Image imageUcak1= new Image("Plane1.jpg");
        ImageView btnUcak1 = new ImageView(imageUcak1);
        btnUcak1.setFitWidth(200);
        btnUcak1.setFitHeight(200);
//What are u searching , i am checking if image is correct , the other one was wrong , mercedes
        Image imageUcak2 = new Image("Plane2.jpg");
        ImageView btnUcak2 = new ImageView(imageUcak2);
        btnUcak2.setFitWidth(200);
        btnUcak2.setFitHeight(200);

        Image imageUcak3 = new Image("Plane3.jpg");
        ImageView btnUcak3 = new ImageView(imageUcak3);
        btnUcak3.setFitWidth(200);
        btnUcak3.setFitHeight(200);

        Image imageUcak4= new Image("Plane4.jpg");
        ImageView btnUcak4 = new ImageView(imageUcak4);
        btnUcak4.setFitWidth(200);
        btnUcak4.setFitHeight(200);

        Image imageUcak5= new Image("Plane5.jpg");
        ImageView btnUcak5 = new ImageView(imageUcak5);
        btnUcak5.setFitWidth(200);
        btnUcak5.setFitHeight(200);

        Image imageUcak6= new Image("Plane6.jpg");
        ImageView btnUcak6 = new ImageView(imageUcak6);
        btnUcak6.setFitWidth(200);
        btnUcak6.setFitHeight(200);


        planesRoot.getChildren().addAll(iwPlanesBg,btnUcak1,btnUcak2,btnUcak3,btnUcak4,btnUcak5,btnUcak6,btnPlanesGeri);

        btnPlanesGeri.setFitWidth(100);
        btnPlanesGeri.setFitHeight(100);
        btnUcak1.setTranslateX(-250);
        btnUcak1.setTranslateY(-120);
        btnUcak2.setTranslateX(0);
        btnUcak2.setTranslateY(-120);
        btnUcak3.setTranslateX(250);
        btnUcak3.setTranslateY(-120);
        btnUcak4.setTranslateX(-250);
        btnUcak4.setTranslateY(100);
        btnUcak5.setTranslateX(0);
        btnUcak5.setTranslateY(100);
        btnUcak6.setTranslateX(250);
        btnUcak6.setTranslateY(100);

        btnPlanesGeri.setTranslateX(-400);
        btnPlanesGeri.setTranslateY(-350);
        btnPlanesGeri.setOnMouseClicked(e->mainPage.setScene(SecondScene));
        btnUcak1.setOnMouseClicked(e->mainPage.setScene(sceneplane1));
        btnUcak2.setOnMouseClicked(e->mainPage.setScene(sceneplane2));
        btnUcak3.setOnMouseClicked(e->mainPage.setScene(sceneplane3));
        btnUcak4.setOnMouseClicked(e->mainPage.setScene(sceneplane4));
        btnUcak5.setOnMouseClicked(e->mainPage.setScene(sceneplane5));
        btnUcak6.setOnMouseClicked(e->mainPage.setScene(sceneplane6));

        //Planes 1 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean plane1Durum = new AtomicBoolean(false);
        Planes plane_Boeing747 = new Planes(524,"Boeing 747","U.S.A",1970,"988 km/h",151000,64,"137.000.000 kg","500.000.000 $");
        String infoPlane1 = "Model : "+plane_Boeing747.getModel()+"\n"+"Year : "+plane_Boeing747.getYil()+"\n"+"Passangers : "+plane_Boeing747.getYolcu()+"\n"+"Country : "+plane_Boeing747.getUlke()+"\n"+"Top Speed : "+plane_Boeing747.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_Boeing747.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_Boeing747.getKanatAcikligi()+"\n"+"Weight : "+plane_Boeing747.getAgirlik()+"\n"+"Price : "+plane_Boeing747.getFiyat();
        Image imagePlane1 = new Image("20540c9180fa04b18d6dff8e4f5116d0-1280x720.jpg");
        ImageView imgPlane1 = new ImageView(imagePlane1);
        imgPlane1.setFitWidth(600);
        imgPlane1.setFitHeight(600);
        imgPlane1.setTranslateX(-200);
        imgPlane1.setTranslateY(0);

        Label lblPlane1Info= new Label();
        Button btnPlane1GetInfo= new Button("Get Information");
        Image imageGeriPlane1 = new Image("back.jpg");
        ImageView btnPlane1Geri = new ImageView(imageGeriPlane1);
        btnPlane1Geri.setFitWidth(100);
        btnPlane1Geri.setFitHeight(50);
        rootPlane1.setStyle("-fx-background-color: #f0d044");
        rootPlane1.getChildren().addAll(btnPlane1Geri,lblPlane1Info,btnPlane1GetInfo,imgPlane1);
        lblPlane1Info.setTranslateX(300);
        lblPlane1Info.setTranslateY(0);
        btnPlane1GetInfo.setTranslateX(300);
        btnPlane1GetInfo.setTranslateY(-400);
        btnPlane1GetInfo.setMinSize(300,50);
        btnPlane1GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane1GetInfo.setOnAction(actionEvent -> {
            if(!plane1Durum.get()){
                lblPlane1Info.setText(infoPlane1);
                plane1Durum.set(true);
            }
            else {
                lblPlane1Info.setText("");
                plane1Durum.set(false);

            }

        });
        lblPlane1Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");



        btnPlane1Geri.setTranslateX(-400);
        btnPlane1Geri.setTranslateY(-350);
        btnPlane1Geri.setOnMouseClicked(e->mainPage.setScene(planesScene));

// u think image's name can be wrong written ? yes the mercedes , needed 2020-
        //Planes 2 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean plane2Durum = new AtomicBoolean(false);
        Planes plane_F16 = new Planes(2,"F16","U.S.A",1978,"2400 km/h",7800,10,"9.200 kg","20.000.000 $");
        String infoPlane2 = "Model : "+plane_F16.getModel()+"\n"+"Year : "+plane_F16.getYil()+"\n"+"Passangers : "+plane_F16.getYolcu()+"\n"+"Country : "+plane_F16.getUlke()+"\n"+"Top Speed : "+plane_F16.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_F16.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_F16.getKanatAcikligi()+"\n"+"Weight : "+plane_F16.getAgirlik()+"\n"+"Price : "+plane_F16.getFiyat();
        Image imagePlane2 = new Image("1280px-F-16_Fighting_Falcon.jpg");
        ImageView imgPlane2 = new ImageView(imagePlane2);
        imgPlane2.setFitWidth(600);
        imgPlane2.setFitHeight(600);
        imgPlane2.setTranslateX(-200);
        imgPlane2.setTranslateY(0);

        Image imageGeriPlane2 = new Image("back.jpg");
        ImageView imgGeriPlane2 = new ImageView(imageGeriPlane2);
        imgGeriPlane2.setFitWidth(100);
        imgGeriPlane2.setFitHeight(50);

        Label lblPlane2Info= new Label();
        Button btnPlane2GetInfo= new Button("Get Information");
        rootPlane2.getChildren().addAll(imgGeriPlane2,imgPlane2,lblPlane2Info,btnPlane2GetInfo);
        lblPlane2Info.setTranslateX(300);
        lblPlane2Info.setTranslateY(0);
        btnPlane2GetInfo.setTranslateX(300);
        btnPlane2GetInfo.setTranslateY(-400);
        btnPlane2GetInfo.setMinSize(300,50);
        rootPlane2.setStyle("-fx-background-color: #f0d044");

        btnPlane2GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane2GetInfo.setOnAction(actionEvent -> {
            if(!plane2Durum.get()){
                lblPlane2Info.setText(infoPlane2);
                plane2Durum.set(true);
            }
            else {
                lblPlane2Info.setText("");
                plane2Durum.set(false);

            }

        });
        lblPlane2Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");


        imgGeriPlane2.setTranslateX(-400);
        imgGeriPlane2.setTranslateY(-350);
        imgGeriPlane2.setOnMouseClicked(e->mainPage.setScene(planesScene));

        //Planes 3 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean plane3Durum = new AtomicBoolean(false);
        Planes plane_Cargo = new Planes(123,"Airbus A400M Atlas","U.S.A",2008,"780 km/h",141000,42,"76.000 kg","€152.400.000");
        String infoPlane3 = "Model : "+plane_Cargo.getModel()+"\n"+"Year : "+plane_Cargo.getYil()+"\n"+"Passangers : "+plane_Cargo.getYolcu()+"\n"+"Country : "+plane_Cargo.getUlke()+"\n"+"Top Speed : "+plane_Cargo.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_Cargo.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_Cargo.getKanatAcikligi()+"\n"+"Weight : "+plane_Cargo.getAgirlik()+"\n"+"Price : "+plane_Cargo.getFiyat();
        Image imagePlane3 = new Image("uSLVxr.jpg");
        ImageView imgPlane3 = new ImageView(imagePlane3);
        imgPlane3.setFitWidth(600);
        imgPlane3.setFitHeight(600);
        imgPlane3.setTranslateX(-200);
        imgPlane3.setTranslateY(0);

        Label lblPlane3Info= new Label();
        Button btnPlane3GetInfo= new Button("Get Information");

        Image imageGeriPlane3 = new Image("back.jpg");
        ImageView imgGeriPlane3 = new ImageView(imageGeriPlane3);
        imgGeriPlane3.setFitWidth(100);
        imgGeriPlane3.setFitHeight(50);

        rootPlane3.getChildren().addAll(imgGeriPlane3,lblPlane3Info,btnPlane3GetInfo,imgPlane3);
        rootPlane3.setStyle("-fx-background-color: #f0d044");
        lblPlane3Info.setTranslateX(300);
        lblPlane3Info.setTranslateY(0);
        btnPlane3GetInfo.setTranslateX(300);
        btnPlane3GetInfo.setTranslateY(-400);
        btnPlane3GetInfo.setMinSize(300,50);
        btnPlane3GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane3GetInfo.setOnAction(actionEvent -> {
            if(!plane3Durum.get()){
                lblPlane3Info.setText(infoPlane3);
                plane3Durum.set(true);
            }
            else {
                lblPlane3Info.setText("");
                plane3Durum.set(false);

            }

        });
        lblPlane3Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        imgGeriPlane3.setTranslateX(-400);
        imgGeriPlane3.setTranslateY(-350);
        imgGeriPlane3.setOnMouseClicked(e->mainPage.setScene(planesScene));



        //Planes 4 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean plane4Durum = new AtomicBoolean(false);
        Planes plane_FireFighter = new Planes(2,"Be-200","Russia",1998,"710 km/h",41000,33,"27.000 kg","70.000$");
        String infoPlane4 = "Model : "+plane_FireFighter.getModel()+"\n"+"Year : "+plane_FireFighter.getYil()+"\n"+"Passangers : "+plane_FireFighter.getYolcu()+"\n"+"Country : "+plane_FireFighter.getUlke()+"\n"+"Top Speed : "+plane_FireFighter.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_FireFighter.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_FireFighter.getKanatAcikligi()+"\n"+"Weight : "+plane_FireFighter.getAgirlik()+"\n"+"Price : "+plane_FireFighter.getFiyat();
        Image imagePlane4 = new Image("turkiye-yanginlara-karsi-ab-den-yardim-talep-14302617_1001_m.jpg");
        ImageView imgPlane4 = new ImageView(imagePlane4);
        imgPlane4.setFitWidth(600);
        imgPlane4.setFitHeight(600);
        imgPlane4.setTranslateX(-200);
        imgPlane4.setTranslateY(0);
        Label lblPlane4Info= new Label();
        Button btnPlane4GetInfo= new Button("Get Information");
        rootPlane4.setStyle("-fx-background-color: #f0d044");
        lblPlane4Info.setTranslateX(300);
        lblPlane4Info.setTranslateY(0);
        btnPlane4GetInfo.setTranslateX(300);
        btnPlane4GetInfo.setTranslateY(-400);
        btnPlane4GetInfo.setMinSize(300,50);
        btnPlane4GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane4GetInfo.setOnAction(actionEvent -> {
            if(!plane4Durum.get()){
                lblPlane4Info.setText(infoPlane4);
                plane4Durum.set(true);
            }
            else {
                lblPlane4Info.setText("");
                plane4Durum.set(false);
            }
        });
        lblPlane4Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        Image imageGeriPlane4 = new Image("back.jpg");
        ImageView imgGeriPlane4 = new ImageView(imageGeriPlane4);
        imgGeriPlane4.setFitWidth(100);
        imgGeriPlane4.setFitHeight(50);

        rootPlane4.getChildren().addAll(imgGeriPlane4,btnPlane4GetInfo,lblPlane4Info,imgPlane4);

        imgGeriPlane4.setTranslateX(-400);
        imgGeriPlane4.setTranslateY(-350);
        imgGeriPlane4.setOnMouseClicked(e->mainPage.setScene(planesScene));
        //Planes 5 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------

        AtomicBoolean plane5Durum = new AtomicBoolean(false);
        Planes plane_Bomber = new Planes(6,"B-52","U.S.A",1956,"1000 km/h",1200000,56,"83.000 kg","14.000.000$");
        String infoPlane5 = "Model : "+plane_Bomber.getModel()+"\n"+"Year : "+plane_Bomber.getYil()+"\n"+"Passangers : "+plane_Bomber.getYolcu()+"\n"+"Country : "+plane_Bomber.getUlke()+"\n"+"Top Speed : "+plane_Bomber.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_Bomber.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_Bomber.getKanatAcikligi()+"\n"+"Weight : "+plane_Bomber.getAgirlik()+"\n"+"Price : "+plane_Bomber.getFiyat();
        Image imagePlane5 = new Image("B-52_1.jpg");
        ImageView imgPlane5 = new ImageView(imagePlane5);
        imgPlane5.setFitWidth(600);
        imgPlane5.setFitHeight(600);
        imgPlane5.setTranslateX(-200);
        imgPlane5.setTranslateY(0);
        Label lblPlane5Info= new Label();
        Button btnPlane5GetInfo= new Button("Get Information");
        rootPlane5.setStyle("-fx-background-color: #f0d044");
        lblPlane5Info.setTranslateX(300);
        lblPlane5Info.setTranslateY(0);
        btnPlane5GetInfo.setTranslateX(300);
        btnPlane5GetInfo.setTranslateY(-400);
        btnPlane5GetInfo.setMinSize(300,50);
        btnPlane5GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane5GetInfo.setOnAction(actionEvent -> {
            if(!plane5Durum.get()){
                lblPlane5Info.setText(infoPlane5);
                plane5Durum.set(true);
            }
            else {
                lblPlane5Info.setText("");
                plane5Durum.set(false);
            }
        });
        lblPlane5Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        Image imageGeriPlane5 = new Image("back.jpg");
        ImageView imgGeriPlane5 = new ImageView(imageGeriPlane5);
        imgGeriPlane5.setFitWidth(100);
        imgGeriPlane5.setFitHeight(50);

        rootPlane5.getChildren().addAll(imgGeriPlane5,btnPlane5GetInfo,lblPlane5Info,imgPlane5);
        imgGeriPlane5.setTranslateX(-400);
        imgGeriPlane5.setTranslateY(-350);
        imgGeriPlane5.setOnMouseClicked(e->mainPage.setScene(planesScene));

        //Planes 6 Page Properties -------------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean plane6Durum = new AtomicBoolean(false);
        Planes plane_Sr71 = new Planes(2,"SR-71","U.S.A",1966,"3540 km/h" ,69000,17,"30.000 kg","Denial of Service");
        String infoPlane6 = "Model : "+plane_Sr71.getModel()+"\n"+"Year : "+plane_Sr71.getYil()+"\n"+"Passangers : "+plane_Sr71.getYolcu()+"\n"+"Country : "+plane_Sr71.getUlke()+"\n"+"Top Speed : "+plane_Sr71.getMaxSpeed()+"\n"+"Weight Capacity : "+ plane_Sr71.getYukKapasitesi()+"\n"+"Wingspan : "+ plane_Sr71.getYukKapasitesi()+"\n"+"Weight : "+plane_Sr71.getAgirlik()+"\n"+"Price : "+plane_Sr71.getFiyat();
        Image imagePlane6 = new Image("1592158911668902-1.jpg");
        ImageView imgPlane6 = new ImageView(imagePlane6);
        imgPlane6.setFitWidth(600);
        imgPlane6.setFitHeight(600);
        imgPlane6.setTranslateX(-200);
        imgPlane6.setTranslateY(0);

        Label lblPlane6Info= new Label();
        Button btnPlane6GetInfo= new Button("Get Information");
        rootPlane6.setStyle("-fx-background-color: #f0d044");
        lblPlane6Info.setTranslateX(300);
        lblPlane6Info.setTranslateY(0);
        btnPlane6GetInfo.setTranslateX(300);
        btnPlane6GetInfo.setTranslateY(-400);
        btnPlane6GetInfo.setMinSize(300,50);
        btnPlane6GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnPlane6GetInfo.setOnAction(actionEvent -> {
            if(!plane6Durum.get()){
                lblPlane6Info.setText(infoPlane6);
                plane6Durum.set(true);
            }
            else {
                lblPlane6Info.setText("");
                plane6Durum.set(false);
            }
        });
        lblPlane6Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriPlane6 = new Image("back.jpg");
        ImageView imgGeriPlane6 = new ImageView(imageGeriPlane6);
        imgGeriPlane6.setFitWidth(100);
        imgGeriPlane6.setFitHeight(50);

        rootPlane6.getChildren().addAll(imgGeriPlane6,btnPlane6GetInfo,lblPlane6Info,imgPlane6);
        imgGeriPlane6.setTranslateX(-400);
        imgGeriPlane6.setTranslateY(-350);
        imgGeriPlane6.setOnMouseClicked(e->mainPage.setScene(planesScene));

        //ShipsPage Properties -------------------------------------------------------------------------------------------
        Image imageShipsBg = new Image("bgShıps.jpg");
        ImageView iwShipsBg = new ImageView(imageShipsBg);
        iwShipsBg.setFitWidth(1000);
        iwShipsBg.setFitHeight(1000);

        Image imageShipss = new Image("home.png");
        ImageView btnShipsGeri = new ImageView(imageShipss);

        Image imageGemi1 = new Image("Ship1.jpg");
        ImageView btnGemi1 = new ImageView(imageGemi1);
        btnGemi1.setFitWidth(200);
        btnGemi1.setFitHeight(200);

        Image imageGemi2 = new Image("Ship2.jpg");
        ImageView btnGemi2 = new ImageView(imageGemi2);
        btnGemi2.setFitWidth(200);
        btnGemi2.setFitHeight(200);

        Image imageGemi3 = new Image("Ship3.jpg");
        ImageView btnGemi3 = new ImageView(imageGemi3);
        btnGemi3.setFitWidth(200);
        btnGemi3.setFitHeight(200);

        Image imageGemi4 = new Image("Ship4.jpeg");
        ImageView btnGemi4 = new ImageView(imageGemi4);
        btnGemi4.setFitWidth(200);
        btnGemi4.setFitHeight(200);

        Image imageGemi5 = new Image("Ship5.jpg");
        ImageView btnGemi5 = new ImageView(imageGemi5);
        btnGemi5.setFitWidth(200);
        btnGemi5.setFitHeight(200);

        Image imageGemi6 = new Image("Ship6.jpg");
        ImageView btnGemi6 = new ImageView(imageGemi6);
        btnGemi6.setFitWidth(200);
        btnGemi6.setFitHeight(200);


        shipsRoot.getChildren().addAll(iwShipsBg,btnGemi1,btnGemi2,btnGemi3,btnGemi4,btnGemi5,btnGemi6,btnShipsGeri);
        btnShipsGeri.setFitWidth(100);
        btnShipsGeri.setFitHeight(100);

        btnGemi1.setTranslateX(-250);
        btnGemi1.setTranslateY(-120);
        btnGemi2.setTranslateX(0);
        btnGemi2.setTranslateY(-120);
        btnGemi3.setTranslateX(250);
        btnGemi3.setTranslateY(-120);
        btnGemi4.setTranslateX(-250);
        btnGemi4.setTranslateY(100);
        btnGemi5.setTranslateX(0);
        btnGemi5.setTranslateY(100);
        btnGemi6.setTranslateX(250);
        btnGemi6.setTranslateY(100);
        btnShipsGeri.setTranslateX(-400);
        btnShipsGeri.setTranslateY(-350);
        btnShipsGeri.setOnMouseClicked(e->mainPage.setScene(SecondScene));
        btnGemi1.setOnMouseClicked(e->mainPage.setScene(gemi1));
        btnGemi2.setOnMouseClicked(e->mainPage.setScene(gemi2));
        btnGemi3.setOnMouseClicked(e->mainPage.setScene(gemi3));
        btnGemi4.setOnMouseClicked(e->mainPage.setScene(gemi4));
        btnGemi5.setOnMouseClicked(e->mainPage.setScene(gemi5));
        btnGemi6.setOnMouseClicked(e->mainPage.setScene(gemi6));

        //Ship1 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship1Durum = new AtomicBoolean(false);
        Ships ship_Aircraft = new Ships("Aircraft Carrier",1913,"Military","33 km/h","65.000.000 kg",2600,60,"4.400.000.000$");
        String infoShip1 = "Model : "+ship_Aircraft.getModel()+"\n"+"Year : "+ship_Aircraft.getYil()+"\n"+"Type : "+ship_Aircraft.getType()+"\n"+"Top Speed : "+ship_Aircraft.getMaxSpeed()+"\n"+"Weight : "+ship_Aircraft.getAgirlik()+"\n"+"Passanger : "+ship_Aircraft.getYolcu()+"\n"+"Vehicle Passanger : "+ship_Aircraft.getAracYolcu()+"\n"+"Price : "+ship_Aircraft.getFiyat();
        Image imageShip1 = new Image("551421-491902076.jpg");
        ImageView imgShip1 = new ImageView(imageShip1);
        imgShip1.setFitWidth(600);
        imgShip1.setFitHeight(600);
        imgShip1.setTranslateX(-200);
        imgShip1.setTranslateY(0);

        Label lblShip1Info= new Label();
        Button btnShip1GetInfo= new Button("Get Information");
        rootGemi1.setStyle("-fx-background-color: #f0d044");
        lblShip1Info.setTranslateX(300);
        lblShip1Info.setTranslateY(0);
        btnShip1GetInfo.setTranslateX(300);
        btnShip1GetInfo.setTranslateY(-400);
        btnShip1GetInfo.setMinSize(300,50);
        btnShip1GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip1GetInfo.setOnAction(actionEvent -> {
            if(!ship1Durum.get()){
                lblShip1Info.setText(infoShip1);
                ship1Durum.set(true);
            }
            else {
                lblShip1Info.setText("");
                ship1Durum.set(false);
            }
        });
        lblShip1Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriShip1 = new Image("back.jpg");
        ImageView btnShip1Geri = new ImageView(imageGeriShip1);
        btnShip1Geri.setFitWidth(100);
        btnShip1Geri.setFitHeight(50);

        rootGemi1.getChildren().addAll(btnShip1Geri,btnShip1GetInfo,lblShip1Info,imgShip1);
        btnShip1Geri.setTranslateX(-400);
        btnShip1Geri.setTranslateY(-350);
        btnShip1Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));

        //Ship2 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship2Durum = new AtomicBoolean(false);
        Ships ship_Ferry = new Ships("Car Ferry",2016,"Commercial","75 km/h","50.000.000 kg",1200,225,"5.000.000$");
        String infoShip2 = "Model : "+ship_Ferry.getModel()+"\n"+"Year : "+ship_Ferry.getYil()+"\n"+"Type : "+ship_Ferry.getType()+"\n"+"Top Speed : "+ship_Ferry.getMaxSpeed()+"\n"+"Weight : "+ship_Ferry.getAgirlik()+"\n"+"Passanger : "+ship_Ferry.getYolcu()+"\n"+"Vehicle Passanger : "+ship_Ferry.getAracYolcu()+"\n"+"Price : "+ship_Ferry.getFiyat();
        Image imageShip2 = new Image("14198_16_9_1552459059.jpg");
        ImageView imgShip2 = new ImageView(imageShip2);
        imgShip2.setFitWidth(600);
        imgShip2.setFitHeight(600);
        imgShip2.setTranslateX(-200);
        imgShip2.setTranslateY(0);

        Label lblShip2Info= new Label();
        Button btnShip2GetInfo= new Button("Get Information");
        rootGemi2.setStyle("-fx-background-color: #f0d044");
        lblShip2Info.setTranslateX(300);
        lblShip2Info.setTranslateY(0);
        btnShip2GetInfo.setTranslateX(300);
        btnShip2GetInfo.setTranslateY(-400);
        btnShip2GetInfo.setMinSize(300,50);
        btnShip2GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip2GetInfo.setOnAction(actionEvent -> {
            if(!ship2Durum.get()){
                lblShip2Info.setText(infoShip2);
                ship2Durum.set(true);
            }
            else {
                lblShip2Info.setText("");
                ship2Durum.set(false);
            }
        });
        lblShip2Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriShip2 = new Image("back.jpg");
        ImageView btnShip2Geri = new ImageView(imageGeriShip2);
        btnShip2Geri.setFitWidth(100);
        btnShip2Geri.setFitHeight(50);
        rootGemi2.getChildren().addAll(btnShip2Geri,lblShip2Info,btnShip2GetInfo,imgShip2);
        btnShip2Geri.setTranslateX(-400);
        btnShip2Geri.setTranslateY(-350);
        btnShip2Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));
        //Ship3 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship3Durum = new AtomicBoolean(false);
        Ships ship_Destroyer = new Ships("Destroyer",1960,"Military","83 km/h","8.000.000 kg",300,0,"4.000.000.000$");
        String infoShip3 = "Model : "+ship_Destroyer.getModel()+"\n"+"Year : "+ship_Destroyer.getYil()+"\n"+"Type : "+ship_Destroyer.getType()+"\n"+"Top Speed : "+ship_Destroyer.getMaxSpeed()+"\n"+"Weight : "+ship_Destroyer.getAgirlik()+"\n"+"Passanger : "+ship_Destroyer.getYolcu()+"\n"+"Vehicle Passanger : "+ship_Destroyer.getAracYolcu()+"\n"+"Price : "+ship_Destroyer.getFiyat();
        Image imageShip3 = new Image("pship4-a-destroyer-poster-kanvas-tablo-canvas-print-resim-baski-1000x1000w.jpg");
        ImageView imgShip3 = new ImageView(imageShip3);
        imgShip3.setFitWidth(600);
        imgShip3.setFitHeight(600);
        imgShip3.setTranslateX(-200);
        imgShip3.setTranslateY(0);

        Label lblShip3Info= new Label();
        Button btnShip3GetInfo= new Button("Get Information");
        rootGemi3.setStyle("-fx-background-color: #f0d044");
        lblShip3Info.setTranslateX(300);
        lblShip3Info.setTranslateY(0);
        btnShip3GetInfo.setTranslateX(300);
        btnShip3GetInfo.setTranslateY(-400);
        btnShip3GetInfo.setMinSize(300,50);
        btnShip3GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip3GetInfo.setOnAction(actionEvent -> {
            if(!ship3Durum.get()){
                lblShip3Info.setText(infoShip3);
                ship3Durum.set(true);
            }
            else {
                lblShip3Info.setText("");
                ship3Durum.set(false);
            }
        });
        lblShip3Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriShip3 = new Image("back.jpg");
        ImageView btnShip3Geri = new ImageView(imageGeriShip3);
        btnShip3Geri.setFitWidth(100);
        btnShip3Geri.setFitHeight(50);
        rootGemi3.getChildren().addAll(btnShip3Geri,btnShip3GetInfo,lblShip3Info,imgShip3);
        btnShip3Geri.setTranslateX(-400);
        btnShip3Geri.setTranslateY(-350);
        btnShip3Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));

        //Ship4 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship4Durum = new AtomicBoolean(false);
        Ships ship_Submarine = new Ships("Submarine",1953,"Military","59 km/h","18.000.000 kg",134,0,"2.800.000.000$");
        String infoShip4 = "Model : "+ship_Submarine.getModel()+"\n"+"Year : "+ship_Submarine.getYil()+"\n"+"Type : "+ship_Submarine.getType()+"\n"+"Top Speed : "+ship_Submarine.getMaxSpeed()+"\n"+"Weight : "+ship_Submarine.getAgirlik()+"\n"+"Passanger : "+ship_Submarine.getYolcu()+"\n"+"Vehicle Passanger : "+ship_Submarine.getAracYolcu()+"\n"+"Price : "+ship_Submarine.getFiyat();
        Image imageShip4 = new Image("WhatsApp-Image-2021-02-28-at-5.00.07-PM.jpeg");
        ImageView imgShip4 = new ImageView(imageShip4);
        imgShip4.setFitWidth(600);
        imgShip4.setFitHeight(600);
        imgShip4.setTranslateX(-200);
        imgShip4.setTranslateY(0);

        Label lblShip4Info= new Label();
        Button btnShip4GetInfo= new Button("Get Information");
        rootGemi4.setStyle("-fx-background-color: #f0d044");
        lblShip4Info.setTranslateX(300);
        lblShip4Info.setTranslateY(0);
        btnShip4GetInfo.setTranslateX(300);
        btnShip4GetInfo.setTranslateY(-400);
        btnShip4GetInfo.setMinSize(300,50);
        btnShip4GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip4GetInfo.setOnAction(actionEvent -> {
            if(!ship4Durum.get()){
                lblShip4Info.setText(infoShip4);
                ship4Durum.set(true);
            }
            else {
                lblShip4Info.setText("");
                ship4Durum.set(false);
            }
        });
        lblShip4Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");

        Image imageGeriShip4 = new Image("back.jpg");
        ImageView btnShip4Geri = new ImageView(imageGeriShip4);
        btnShip4Geri.setFitWidth(100);
        btnShip4Geri.setFitHeight(50);
        rootGemi4.getChildren().addAll(btnShip4Geri,btnShip4GetInfo,lblShip4Info,imgShip4);
        btnShip4Geri.setTranslateX(-400);
        btnShip4Geri.setTranslateY(-350);
        btnShip4Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));
        //Ship5 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship5Durum = new AtomicBoolean(false);
        Ships ship_Yacht = new Ships("Yacht",2015,"Private","65 km/h","12.000 kg",7,0,"3.500.000 TL");
        String infoShip5 = "Model : "+ship_Yacht.getModel()+"\n"+"Year : "+ship_Yacht.getYil()+"\n"+"Type : "+ship_Yacht.getType()+"\n"+"Top Speed : "+ship_Yacht.getMaxSpeed()+"\n"+"Weight : "+ship_Yacht.getAgirlik()+"\n"+"Passanger : "+ship_Yacht.getYolcu()+"\n"+"Vehicle Passanger : "+ship_Yacht.getAracYolcu()+"\n"+"Price : "+ship_Yacht.getFiyat();
        Image imageShip5 = new Image("Su_Royal_en1.jpg");
        ImageView imgShip5 = new ImageView(imageShip5);
        imgShip5.setFitWidth(600);
        imgShip5.setFitHeight(600);
        imgShip5.setTranslateX(-200);
        imgShip5.setTranslateY(0);

        Label lblShip5Info= new Label();
        Button btnShip5GetInfo= new Button("Get Information");
        rootGemi5.setStyle("-fx-background-color: #f0d044");
        lblShip5Info.setTranslateX(300);
        lblShip5Info.setTranslateY(0);
        btnShip5GetInfo.setTranslateX(300);
        btnShip5GetInfo.setTranslateY(-400);
        btnShip5GetInfo.setMinSize(300,50);
        btnShip5GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip5GetInfo.setOnAction(actionEvent -> {
            if(!ship5Durum.get()){
                lblShip5Info.setText(infoShip5);
                ship5Durum.set(true);
            }
            else {
                lblShip5Info.setText("");
                ship5Durum.set(false);
            }
        });
        lblShip5Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");


        Image imageGeriShip5 = new Image("back.jpg");
        ImageView btnShip5Geri = new ImageView(imageGeriShip5);
        btnShip5Geri.setFitWidth(100);
        btnShip5Geri.setFitHeight(50);
        rootGemi5.getChildren().addAll(btnShip5Geri,lblShip5Info,btnShip5GetInfo,imgShip5);
        btnShip5Geri.setTranslateX(-400);
        btnShip5Geri.setTranslateY(-350);
        btnShip5Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));
        //Ship6 Page Properties --------------------------------------------------------------------------------------------------------------------------------------------------------
        AtomicBoolean ship6Durum = new AtomicBoolean(false);
        Ships ship_ContainerShip = new Ships("Container Ship",1996,"Commercial","35 km/h","26.780 kg",30,0,"74.00.000$");
        String infoShip6 = "Model : "+ship_ContainerShip.getModel()+"\n"+"Year : "+ship_ContainerShip.getYil()+"\n"+"Type : "+ship_ContainerShip.getType()+"\n"+"Top Speed : "+ship_ContainerShip.getMaxSpeed()+"\n"+"Weight : "+ship_ContainerShip.getAgirlik()+"\n"+"Passanger : "+ship_ContainerShip.getYolcu()+"\n"+"Vehicle Passanger : "+ship_ContainerShip.getAracYolcu()+"\n"+"Price : "+ship_ContainerShip.getFiyat();
        Image imageShip6 = new Image("MSC_GULSUN.jpg");
        ImageView imgShip6 = new ImageView(imageShip6);
        imgShip6.setFitWidth(600);
        imgShip6.setFitHeight(600);
        imgShip6.setTranslateX(-200);
        imgShip6.setTranslateY(0);// ok delete ok
        Label lblShip6Info= new Label();
        Button btnShip6GetInfo= new Button("Get Information");
        rootGemi6.setStyle("-fx-background-color: #f0d044");
        lblShip6Info.setTranslateX(300);
        lblShip6Info.setTranslateY(0);
        btnShip6GetInfo.setTranslateX(300);
        btnShip6GetInfo.setTranslateY(-400);
        btnShip6GetInfo.setMinSize(300,50);
        btnShip6GetInfo.setStyle("-fx-background-color: blue;-fx-font-family: 'Times New Roman';-fx-text-fill: black;-fx-font-size: 19");
        btnShip6GetInfo.setOnAction(actionEvent -> {
            if(!ship6Durum.get()){
                lblShip6Info.setText(infoShip6);
                ship6Durum.set(true);
            }
            else {
                lblShip6Info.setText("");
                ship6Durum.set(false);
            }
        });
        lblShip6Info.setStyle("-fx-text-fill: #0409f8 ;-fx-font-size: 22");
        Image imageGeriShip6 = new Image("back.jpg");
        ImageView btnShip6Geri = new ImageView(imageGeriShip6);
        btnShip6Geri.setFitWidth(100);
        btnShip6Geri.setFitHeight(50);
        rootGemi6.getChildren().addAll(btnShip6Geri,lblShip6Info,btnShip6GetInfo,imgShip6);
        btnShip6Geri.setTranslateX(-400);
        btnShip6Geri.setTranslateY(-350);
        btnShip6Geri.setOnMouseClicked(e->mainPage.setScene(shipsScene));

        mainPage.setTitle("Vehicles");
        mainPage.setScene(scene);
        mainPage.show();
    }
// yes only one file . OIKkkf
    public static void main(String[] args)
    {
        launch(args);

    }



}

