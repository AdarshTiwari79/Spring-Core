package com.sprincore1.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud")
@Scope("prototype")
public class Student {

}
