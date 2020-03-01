package com.gupaoedu.vip.design.principle.simpleResponsibility;

import com.gupaoedu.vip.design.principle.simpleResponsibility.Interface.ICourseInfo;
import com.gupaoedu.vip.design.principle.simpleResponsibility.Interface.ICourseManager;

public class CourseImpl implements ICourseInfo, ICourseManager {
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
