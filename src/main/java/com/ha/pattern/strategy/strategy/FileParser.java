package com.ha.pattern.strategy.strategy;

import com.ha.pattern.strategy.constant.FileTypeEnum;
import java.io.File;

public interface FileParser {

  FileTypeEnum getFileType();

  void parse(File file);
}
