package com.nicole.springBoot.chapter1.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by xl on 2017/8/10.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
