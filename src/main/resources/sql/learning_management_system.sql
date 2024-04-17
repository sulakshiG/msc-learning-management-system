-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2024 at 11:00 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `learning_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `academic_staff`
--

CREATE TABLE `academic_staff` (
  `staff_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `attempt_history`
--

CREATE TABLE `attempt_history` (
  `attempt_number` int(11) NOT NULL,
  `attempt_mark` int(11) DEFAULT NULL CHECK (0 <= `attempt_mark` and `attempt_mark` <= 100),
  `attempt_date` date DEFAULT NULL,
  `attempt_type` enum('repeat','medical') NOT NULL,
  `course_code` varchar(10) DEFAULT NULL,
  `student_index` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `batch`
--

CREATE TABLE `batch` (
  `academic_year` varchar(50) NOT NULL,
  `started_date` date NOT NULL,
  `no_of_students` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_code` varchar(10) NOT NULL,
  `course_name` varchar(100) NOT NULL,
  `course_instructor_id` varchar(20) DEFAULT NULL,
  `course_credit` decimal(4,2) DEFAULT NULL CHECK (`course_credit` > 0),
  `passing_grade` varchar(2) DEFAULT NULL,
  `academic_year` varchar(10) NOT NULL,
  `prerequisites` text DEFAULT NULL,
  `course_type` enum('Optional','Core','Foundation') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `enrollment_id` int(11) NOT NULL,
  `course_code` varchar(10) DEFAULT NULL,
  `student_index` varchar(15) NOT NULL,
  `enrollment_status` enum('completed','active','withdrawn') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `exam_time_table`
--

CREATE TABLE `exam_time_table` (
  `exam_id` varchar(50) NOT NULL,
  `exam_date` date NOT NULL,
  `exam_time` time NOT NULL,
  `course` varchar(10) NOT NULL,
  `exam_semester` varchar(20) NOT NULL,
  `academic_year` varchar(50) DEFAULT NULL,
  `exam_name` varchar(50) DEFAULT NULL,
  `exam_invigilator_id` varchar(10) DEFAULT NULL,
  `exam_venue` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

CREATE TABLE `grades` (
  `range_of_marks` varchar(10) NOT NULL,
  `grade` varchar(2) NOT NULL,
  `grade_point_value` decimal(3,2) NOT NULL,
  `implication` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lectures_time_table`
--

CREATE TABLE `lectures_time_table` (
  `lecture_id` int(11) NOT NULL,
  `course_code` varchar(10) NOT NULL,
  `lecturer` varchar(10) NOT NULL,
  `lecture_day` enum('Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday') NOT NULL,
  `lecture_time` time NOT NULL,
  `lecture_venue` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `location_id` varchar(50) NOT NULL,
  `location_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `non_academic_staff`
--

CREATE TABLE `non_academic_staff` (
  `staff_id` varchar(10) DEFAULT NULL,
  `over_time_hours` int(11) DEFAULT NULL,
  `over_time_hour_rate` int(11) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `staff_id` varchar(10) DEFAULT NULL,
  `student_index` varchar(15) DEFAULT NULL,
  `payment_id` varchar(10) DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  `payment_amount` decimal(10,2) DEFAULT NULL,
  `payment_method` enum('full','installments') DEFAULT NULL,
  `payment_type` enum('course fee','exam fee','registration fee') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `course_code` varchar(10) NOT NULL,
  `student_index` varchar(15) NOT NULL,
  `grade` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` varchar(10) NOT NULL,
  `staff_name` varchar(50) NOT NULL,
  `staff_email` varchar(50) NOT NULL,
  `staff_contact` varchar(12) NOT NULL,
  `staff_type` enum('academic_staff','non_academic_staff') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_index` varchar(15) NOT NULL,
  `student_registration_no` varchar(15) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact_no` varchar(15) NOT NULL,
  `date_of_birth` date NOT NULL,
  `academic_year` varchar(10) NOT NULL,
  `gender` enum('male','female') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `academic_staff`
--
ALTER TABLE `academic_staff`
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `attempt_history`
--
ALTER TABLE `attempt_history`
  ADD PRIMARY KEY (`attempt_number`) USING BTREE,
  ADD KEY `course_code` (`course_code`),
  ADD KEY `student_index` (`student_index`);

--
-- Indexes for table `batch`
--
ALTER TABLE `batch`
  ADD PRIMARY KEY (`academic_year`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_code`);

--
-- Indexes for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`enrollment_id`),
  ADD KEY `course_code` (`course_code`),
  ADD KEY `student_index` (`student_index`);

--
-- Indexes for table `exam_time_table`
--
ALTER TABLE `exam_time_table`
  ADD PRIMARY KEY (`exam_id`),
  ADD KEY `exam_invigilator_id` (`exam_invigilator_id`),
  ADD KEY `exam_venue` (`exam_venue`),
  ADD KEY `course` (`course`),
  ADD KEY `academic_year` (`academic_year`);

--
-- Indexes for table `lectures_time_table`
--
ALTER TABLE `lectures_time_table`
  ADD PRIMARY KEY (`lecture_id`),
  ADD KEY `lecturer` (`lecturer`),
  ADD KEY `lecture_venue` (`lecture_venue`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`location_id`);

--
-- Indexes for table `non_academic_staff`
--
ALTER TABLE `non_academic_staff`
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD KEY `staff_id` (`staff_id`),
  ADD KEY `student_index` (`student_index`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD KEY `student_index` (`student_index`),
  ADD KEY `course_code` (`course_code`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_index`),
  ADD UNIQUE KEY `student_registration_no` (`student_registration_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `enrollment`
--
ALTER TABLE `enrollment`
  MODIFY `enrollment_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lectures_time_table`
--
ALTER TABLE `lectures_time_table`
  MODIFY `lecture_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `academic_staff`
--
ALTER TABLE `academic_staff`
  ADD CONSTRAINT `academic_staff_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `attempt_history`
--
ALTER TABLE `attempt_history`
  ADD CONSTRAINT `attempt_history_ibfk_1` FOREIGN KEY (`course_code`) REFERENCES `course` (`course_code`),
  ADD CONSTRAINT `attempt_history_ibfk_2` FOREIGN KEY (`student_index`) REFERENCES `student` (`student_index`);

--
-- Constraints for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD CONSTRAINT `enrollment_ibfk_1` FOREIGN KEY (`course_code`) REFERENCES `course` (`course_code`),
  ADD CONSTRAINT `enrollment_ibfk_2` FOREIGN KEY (`student_index`) REFERENCES `student` (`student_index`);

--
-- Constraints for table `exam_time_table`
--
ALTER TABLE `exam_time_table`
  ADD CONSTRAINT `exam_time_table_ibfk_1` FOREIGN KEY (`exam_invigilator_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `exam_time_table_ibfk_2` FOREIGN KEY (`exam_venue`) REFERENCES `location` (`location_id`),
  ADD CONSTRAINT `exam_time_table_ibfk_3` FOREIGN KEY (`course`) REFERENCES `course` (`course_code`),
  ADD CONSTRAINT `exam_time_table_ibfk_4` FOREIGN KEY (`academic_year`) REFERENCES `batch` (`academic_year`);

--
-- Constraints for table `lectures_time_table`
--
ALTER TABLE `lectures_time_table`
  ADD CONSTRAINT `lectures_time_table_ibfk_1` FOREIGN KEY (`lecturer`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `lectures_time_table_ibfk_2` FOREIGN KEY (`lecture_venue`) REFERENCES `location` (`location_id`);

--
-- Constraints for table `non_academic_staff`
--
ALTER TABLE `non_academic_staff`
  ADD CONSTRAINT `non_academic_staff_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`student_index`) REFERENCES `student` (`student_index`);

--
-- Constraints for table `results`
--
ALTER TABLE `results`
  ADD CONSTRAINT `results_ibfk_1` FOREIGN KEY (`student_index`) REFERENCES `student` (`student_index`),
  ADD CONSTRAINT `results_ibfk_2` FOREIGN KEY (`course_code`) REFERENCES `course` (`course_code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
