;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname bools) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(require 2htdp/image)

;true
;false

(define HEIGHT 100)
(define WIDTH 100)

(> WIDTH HEIGHT)
(>= WIDTH HEIGHT)

(= 1 2)
(= 1 1)
(> 3 9)

(define I1 (rectangle 10 20 "solid" "blue"))
(define I2 (rectangle 20 30 "solid" "blue"))

(< (image-width I1)
   (image-width I2))