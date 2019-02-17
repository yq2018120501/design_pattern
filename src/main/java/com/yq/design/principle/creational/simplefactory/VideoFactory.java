package com.yq.design.principle.creational.simplefactory;

/**
 * Created by Mr.Yang on 2019/2/17 0017.
 */
public class VideoFactory {
    public Video getVideo(Class clazz){
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
//    public Video getVideo(String type){
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }
}
